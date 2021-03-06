package com.mockuai.messagecenter.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
/**
 * @author
 * @since 
 */
public class Starter {
	private static final Logger log = LoggerFactory.getLogger(Starter.class);
	public static void main(String[] args) throws Exception {
	Properties properties = new Properties();

        // p.load(new FileInputStream(
        // "C:/workspaces/school/trunk1/school-parent/main-service/src/main/resources/druid-db-dev.properties"));
        properties.putAll(System.getProperties());
        if (args != null && args.length > 0) {
            String arg = args[0];
            //p.put("druid.config.file", args[0]);
            switch (arg) {
                case "local":
                    properties.load(Files.newInputStream(Paths.get("e:", "haiyn","messagecenter","haiyn-local.properties")));
                    break;
                case "dev":
                    properties.load(Files.newInputStream(Paths.get("/data/prop/messagecenter/haiyn-dev.properties")));
                    break;
                case "pre":
                    properties.load(Files.newInputStream(Paths.get("/data/prop/messagecenter/haiyn-pre.properties")));
                    break;
                case "online":
                    properties.load(Files.newInputStream(Paths.get("/data/prop/messagecenter/haiyn-online.properties")));
                    break;
            }
            System.setProperties(properties);
        }else{
            throw  new Exception("请输入环境变量 local test pre online");
        }

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:applicationContext.xml"});
        log.info("-------初始运行化完成--------");
        context.start();
        log.info("--------启动完成---------");
        while (true){

        }
		/*if(args[0].equals("start")){
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:applicationContext.xml"});
			log.info("-------初始运行化完成--------");
			context.start();
			log.info("--------启动完成---------");
		}else{
			System.exit(0);
			log.info("--------运行结束完成---------");
		}*/
	}
}
