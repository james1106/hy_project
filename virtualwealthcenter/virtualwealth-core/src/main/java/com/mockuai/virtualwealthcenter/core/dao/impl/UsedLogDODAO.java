package com.mockuai.virtualwealthcenter.core.dao.impl;

import com.mockuai.virtualwealthcenter.core.domain.UsedLogDO;

public interface UsedLogDODAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    void insert(UsedLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    void insertSelective(UsedLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    UsedLogDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    int updateByPrimaryKeySelective(UsedLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table used_log
     *
     * @mbggenerated Thu May 12 17:36:19 CST 2016
     */
    int updateByPrimaryKey(UsedLogDO record);
}