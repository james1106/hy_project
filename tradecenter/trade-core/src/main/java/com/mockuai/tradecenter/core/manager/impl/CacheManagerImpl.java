package com.mockuai.tradecenter.core.manager.impl;

import com.mockuai.tradecenter.core.manager.CacheManager;
import net.spy.memcached.AddrUtil;
import net.spy.memcached.CASValue;
import net.spy.memcached.ConnectionFactoryBuilder;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.auth.AuthDescriptor;
import net.spy.memcached.auth.PlainCallbackHandler;
import net.spy.memcached.internal.OperationFuture;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Created by zengzhangqiang on 6/11/15.
 */
public class CacheManagerImpl implements CacheManager {
    private static final Logger log = LoggerFactory.getLogger(CacheManagerImpl.class);

    private MemcachedClient memcachedClient;
    private final String host = "0c300bb107854a84.m.cnhzalicm10pub001.ocs.aliyuncs.com";//控制台上的“内网地址”
    private final String port ="11211"; //默认端口 11211，不用改
    private final String username = "0c300bb107854a84";//控制台上的“访问账号”
    private final String password = "HZmkocs001";//邮件中提供的“密码”

    public void init(){
        try{
            //TODO 断开重连机制确认
            AuthDescriptor ad = new AuthDescriptor(new String[]{"PLAIN"}, new PlainCallbackHandler(username, password));
            memcachedClient = new MemcachedClient(
                    new ConnectionFactoryBuilder().setProtocol(ConnectionFactoryBuilder.Protocol.BINARY)
                            .setAuthDescriptor(ad)
                            .build(),
                    AddrUtil.getAddresses(host + ":" + port));
        }catch(Exception e){
            log.error("ocs client init error", e);
        }
    }

    @Override
    public void set(String key, int expired, Object obj){
        if(StringUtils.isBlank(key) || obj==null){
            return;
        }
        //TODO expired时间单位确认，超时时间设定，服务异常容错，同步/异步设置处理
        memcachedClient.set(key, expired, obj);
        
    }

    @Override
    public Object get(String key){
        if(StringUtils.isBlank(key)){
            return null;
        }
        //TODO 确认这里的GET是否会TOUCH缓存
        //TODO 超时时间设定，服务异常容错
        return memcachedClient.get(key);
    }

    @Override
    public Object getAndTouch(String key, int expired) {
        if(StringUtils.isBlank(key)){
            return null;
        }
        //TODO 超时时间设定，服务异常容错
        CASValue<Object> result = memcachedClient.getAndTouch(key, expired);
        if(result != null){
            return result.getValue();
        }else{
            return null;
        }
    }

    public static void main(String[] args) {

        final String host = "0c300bb107854a84.m.cnhzalicm10pub001.ocs.aliyuncs.com";//控制台上的“内网地址”
        final String port ="11211"; //默认端口 11211，不用改
        final String username = "0c300bb107854a84";//控制台上的“访问账号”
        final String password = "HZmkocs001";//邮件中提供的“密码”


        MemcachedClient cache = null;
        try {
            AuthDescriptor ad = new AuthDescriptor(new String[]{"PLAIN"}, new PlainCallbackHandler(username, password));
            cache = new MemcachedClient(
                    new ConnectionFactoryBuilder().setProtocol(ConnectionFactoryBuilder.Protocol.BINARY)
                            .setAuthDescriptor(ad)
                            .build(),
                    AddrUtil.getAddresses(host + ":" + port));

            System.out.println("OCS Sample Code");

            //向OCS中存一个key为"ocs"的数据，便于后面验证读取数据
            OperationFuture future = cache.set("ocs", 1000," Open Cache Service,  from www.Aliyun.com");

            //向OCS中存若干个数据，随后可以在OCS控制台监控上看到统计信息
            for(int i=0;i<100;i++){
                String key="key-"+i;
                String value="value-"+i;

                //执行set操作，向缓存中存数据
                cache.set(key, 1000, value);
                future.get();  //  确保之前(mc.set())操作已经结束
            }


            System.out.println("Set操作完成!");



            //执行get操作，从缓存中读数据,读取key为"ocs"的数据
            System.out.println("Get操作:"+cache.get("ocs"));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        if (cache != null) {
            cache.shutdown();
        }

    }//eof
}