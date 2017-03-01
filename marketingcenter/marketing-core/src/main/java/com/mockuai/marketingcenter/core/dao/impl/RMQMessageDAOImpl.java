package com.mockuai.marketingcenter.core.dao.impl;

import com.mockuai.marketingcenter.core.dao.RMQMessageDAO;
import com.mockuai.marketingcenter.core.domain.RMQMessageDO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by edgar.zr on 12/17/15.
 */
public class RMQMessageDAOImpl extends SqlMapClientDaoSupport implements RMQMessageDAO {
    @Override
    public Long addMessage(RMQMessageDO rmqMessageDO) {
        return (Long) getSqlMapClientTemplate().insert("rmq_message.addRMQMessage", rmqMessageDO);
    }
}