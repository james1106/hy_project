package com.mockuai.headsinglecenter.core.service.action.message;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mockuai.headsinglecenter.common.api.HeadSingleResponse;
import com.mockuai.headsinglecenter.common.constant.ActionEnum;
import com.mockuai.headsinglecenter.core.api.RequestAdapter;
import com.mockuai.headsinglecenter.core.exception.HeadSingleException;
import com.mockuai.headsinglecenter.core.manager.HeadSingleInfoManager;
import com.mockuai.headsinglecenter.core.manager.HeadSingleUserManager;
import com.mockuai.headsinglecenter.core.message.msg.PaySuccessMsg;
import com.mockuai.headsinglecenter.core.service.RequestContext;
import com.mockuai.headsinglecenter.core.service.action.Action;
import com.mockuai.headsinglecenter.core.util.HeadSingleUtils;

/**
 * 
 */
@Service
public class OrderCancelSuccessListenerAction implements Action {
    private static final Logger log = LoggerFactory.getLogger(OrderCancelSuccessListenerAction.class);
    @Resource
    private HeadSingleUserManager headSingleUserManager;
    
    @SuppressWarnings("rawtypes")
	@Override
    public HeadSingleResponse execute(RequestContext context) throws HeadSingleException {
    	RequestAdapter request = new RequestAdapter(context.getRequest());
        String appKey = (String) context.get("appKey");
        PaySuccessMsg paySuccessMsg = (PaySuccessMsg) request.getObject("paySuccessMsg");
        
        log.info("head single sub and info mq:"+paySuccessMsg);
        
        if(null == appKey){
        	return null;
        }
    	
        if(null == paySuccessMsg){
        	return null;
        } 
        
        //修改用户订单信息
        Integer result = headSingleUserManager.updateHeadSingleOrderCount(paySuccessMsg.getHeadSingleUserDTO());   
        
        if(null == result || 0 >= result){
        	return null;
        }
    	
    	return HeadSingleUtils.getSuccessResponse(true);
    }

    @Override
    public String getName() {
        return ActionEnum.ORDER_CANCEL_SUCCESS_LISTENER.getActionName();
    }
}