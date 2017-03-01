package com.mockuai.marketingcenter.core.dao.impl;

import com.mockuai.marketingcenter.core.domain.OrderDetailDO;

public interface OrderDetailDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Mon Jul 18 15:38:18 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Mon Jul 18 15:38:18 CST 2016
     */
    void insert(OrderDetailDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Mon Jul 18 15:38:18 CST 2016
     */
    void insertSelective(OrderDetailDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Mon Jul 18 15:38:18 CST 2016
     */
    OrderDetailDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Mon Jul 18 15:38:18 CST 2016
     */
    int updateByPrimaryKeySelective(OrderDetailDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_detail
     *
     * @mbggenerated Mon Jul 18 15:38:18 CST 2016
     */
    int updateByPrimaryKey(OrderDetailDO record);
}