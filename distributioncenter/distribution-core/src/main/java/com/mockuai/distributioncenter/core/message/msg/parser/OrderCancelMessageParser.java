package com.mockuai.distributioncenter.core.message.msg.parser;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.openservices.ons.api.Message;
import com.mockuai.distributioncenter.common.domain.dto.DistributionOrderDTO;
import com.mockuai.distributioncenter.core.exception.DistributionException;
import com.mockuai.distributioncenter.core.manager.AppManager;
import com.mockuai.distributioncenter.core.manager.TradeManager;
import com.mockuai.distributioncenter.core.message.msg.OrderCancelMsg;
import com.mockuai.distributioncenter.core.util.JsonUtil;
import com.mockuai.tradecenter.common.domain.OrderDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;

/**
 * Created by duke on 16/6/24.
 */
@Service
public class OrderCancelMessageParser {
    private static final Logger log = LoggerFactory.getLogger(OrderCancelMessageParser.class);

    @Autowired
    private AppManager appManager;

    @Autowired
    private TradeManager tradeManager;
    
    public OrderCancelMsg parse(Message msg) {
        String msgStr = new String(msg.getBody(), Charset.forName("UTF-8"));
        JSONObject json = JSONObject.parseObject(msgStr);
        Long orderId = json.getLong("id");
        String bizCode = json.getString("bizCode");
        String orderSn = json.getString("orderSn");
        String appKey;
        try {
            appKey = appManager.getAppKeyByBizCode(bizCode);
        } catch (DistributionException e) {
            log.error("get appKey error, bizCode: {}", bizCode);
            return null;
        }
        OrderDTO orderDTO;
        
        try {
            orderDTO = tradeManager.getOrder(orderId, null, appKey);
        } catch (DistributionException e) {
            log.error("get order by orderId: {}, buyerId: {} error", orderId);
            return null;
        }

        OrderCancelMsg orderCancelMsg = new OrderCancelMsg();
        orderCancelMsg.setAppKey(appKey);
        orderCancelMsg.setMsg(msg);

        DistributionOrderDTO distributionOrderDTO = new DistributionOrderDTO();
        distributionOrderDTO.setOrderId(orderId);
        distributionOrderDTO.setOrderSn(orderSn);
        distributionOrderDTO.setPaymentId(orderDTO.getPaymentId());
        orderCancelMsg.setDistributionOrderDTO(distributionOrderDTO);

        log.info("parse order cancel msg: {}", JsonUtil.toJson(orderCancelMsg.getDistributionOrderDTO()));
        return orderCancelMsg;
    }
}
