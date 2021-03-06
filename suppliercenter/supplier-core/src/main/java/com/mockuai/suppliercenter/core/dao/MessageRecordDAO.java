package com.mockuai.suppliercenter.core.dao;

import com.mockuai.suppliercenter.core.domain.MessageRecordDO;

/**
 * Created by duke on 15/11/19.
 */
public interface MessageRecordDAO {
    /**
     * 添加消息记录
     *
     * @param messageRecordDO
     */
    Long addRecord(MessageRecordDO messageRecordDO);

    /**
     * 查询消息记录
     *
     * @param identify
     */
    MessageRecordDO getRecordByIdentifyAndBizType(String identify, Integer bizType);
}
