package com.mockuai.marketingcenter.core.manager.impl;

import com.mockuai.marketingcenter.core.dao.RMQMessageDAO;
import com.mockuai.marketingcenter.core.domain.RMQMessageDO;
import com.mockuai.marketingcenter.core.exception.MarketingException;
import com.mockuai.marketingcenter.core.manager.RMQMessageManager;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by edgar.zr on 12/17/15.
 */
public class RMQMessageManagerImpl implements RMQMessageManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(RMQMessageManagerImpl.class);

    @Autowired
    private RMQMessageDAO rmqMessageDAO;

    @Override
    public Boolean addMessage(Long ownerId, String topic, String tag) throws MarketingException {
        RMQMessageDO rmqMessageDO = new RMQMessageDO();
        rmqMessageDO.setOwnerId(ownerId);
        rmqMessageDO.setTopic(topic);
        rmqMessageDO.setTag(tag);
        if (ownerId == null || StringUtils.isBlank(topic) || StringUtils.isBlank(tag))
            return false;
        try {
            rmqMessageDAO.addMessage(rmqMessageDO);
            return true;
        } catch (Exception e) {
            LOGGER.debug("add RMQMessage, {}", e.getMessage());
            return false;
        }
    }
}