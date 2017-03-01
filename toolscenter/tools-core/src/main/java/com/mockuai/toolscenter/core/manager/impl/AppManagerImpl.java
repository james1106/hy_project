package com.mockuai.toolscenter.core.manager.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.mockuai.appcenter.client.AppClient;
import com.mockuai.appcenter.common.api.Response;
import com.mockuai.appcenter.common.constant.AppTypeEnum;
import com.mockuai.appcenter.common.domain.AppInfoDTO;
import com.mockuai.appcenter.common.domain.BizInfoDTO;
import com.mockuai.toolscenter.common.constant.ResponseCode;
import com.mockuai.toolscenter.core.exception.ToolsException;
import com.mockuai.toolscenter.core.manager.AppManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zengzhangqiang on 6/28/15.
 */
@Component("appManager")
public class AppManagerImpl implements AppManager {
    private static final Logger log = LoggerFactory.getLogger(AppManagerImpl.class);

    @Resource
    private AppClient appClient;

    @Override
    public BizInfoDTO getBizInfo(String bizCode) throws ToolsException {
        if(StringUtils.isBlank(bizCode)){
            throw new ToolsException(ResponseCode.SYS_E_SERVICE_EXCEPTION, "bizCode is null");
        }

        try{
            Response<BizInfoDTO> getResult =
                    appClient.getBizInfo(bizCode);
            if(getResult.getCode() != com.mockuai.appcenter.common.constant.ResponseCode.RESPONSE_SUCCESS.getCode()){
                log.error("error to get bizInfo, bizCode:{}, errorCode:{}, errorMsg:{}",
                        bizCode, getResult.getCode(), getResult.getMessage());
                return null;
            }

            return getResult.getModule();
        }catch(Exception e){
            log.error("bizCode:{}", bizCode, e);
            throw new ToolsException(ResponseCode.SYS_E_SERVICE_EXCEPTION, e);
        }
    }

    @Override
    public AppInfoDTO getAppInfo(String appKey) throws ToolsException {
        if(StringUtils.isBlank(appKey)){
            throw new ToolsException(ResponseCode.SYS_E_SERVICE_EXCEPTION, "appKey is null");
        }

        try{
            Response<AppInfoDTO> getResult =
                    appClient.getAppInfo(appKey);
            if(getResult.getCode() != com.mockuai.appcenter.common.constant.ResponseCode.RESPONSE_SUCCESS.getCode()){
                log.error("error to get appInfo, appKey:{}, errorCode:{}, errorMsg:{}",
                        appKey, getResult.getCode(), getResult.getMessage());
                return null;
            }

            return getResult.getModule();
        }catch(Exception e){
            log.error("appKey:{}", appKey, e);
            throw new ToolsException(ResponseCode.SYS_E_SERVICE_EXCEPTION, e);
        }
    }

    @Override
    public AppInfoDTO getAppInfoByType(String bizCode, AppTypeEnum appTypeEnum) throws ToolsException {
        if (StringUtils.isBlank(bizCode)) {
            throw new ToolsException(ResponseCode.SYS_E_SERVICE_EXCEPTION, "bizCode is null");
        }

        try {
            Response<AppInfoDTO> getResult =
                    appClient.getAppInfoByType(bizCode, appTypeEnum);
            if (getResult.getCode() != com.mockuai.appcenter.common.constant.ResponseCode.RESPONSE_SUCCESS.getCode()) {
                log.error("error to get appInfo, bizCode:{}, errorCode:{}, errorMsg:{}",
                        bizCode, getResult.getCode(), getResult.getMessage());
                return null;
            }

            return getResult.getModule();
        } catch (Exception e) {
            log.error("bizCode:{}", bizCode, e);
            throw new ToolsException(ResponseCode.SYS_E_SERVICE_EXCEPTION, e);
        }
    }
}
