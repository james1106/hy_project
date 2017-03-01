package com.mockuai.itemcenter.common.domain.dto;

import java.io.Serializable;
import java.util.Date;

public class StockFrozenRecordDTO implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.biz_code
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private String bizCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.item_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.sku_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Long skuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.seller_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Long sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.order_sn
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private String orderSn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.number
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Integer number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.status
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.delete_mark
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Integer deleteMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.gmt_created
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_frozen_record.gmt_modified
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    private Date gmtModified;


    private Long storeId;

    private Long supplierId;

    private Long distributorId;

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.id
     *
     * @return the value of stock_frozen_record.id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.id
     *
     * @param id the value for stock_frozen_record.id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.biz_code
     *
     * @return the value of stock_frozen_record.biz_code
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.biz_code
     *
     * @param bizCode the value for stock_frozen_record.biz_code
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.item_id
     *
     * @return the value of stock_frozen_record.item_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.item_id
     *
     * @param itemId the value for stock_frozen_record.item_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.sku_id
     *
     * @return the value of stock_frozen_record.sku_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.sku_id
     *
     * @param skuId the value for stock_frozen_record.sku_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.seller_id
     *
     * @return the value of stock_frozen_record.seller_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.seller_id
     *
     * @param sellerId the value for stock_frozen_record.seller_id
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.order_sn
     *
     * @return the value of stock_frozen_record.order_sn
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.order_sn
     *
     * @param orderSn the value for stock_frozen_record.order_sn
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.number
     *
     * @return the value of stock_frozen_record.number
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.number
     *
     * @param number the value for stock_frozen_record.number
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.status
     *
     * @return the value of stock_frozen_record.status
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.status
     *
     * @param status the value for stock_frozen_record.status
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.delete_mark
     *
     * @return the value of stock_frozen_record.delete_mark
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Integer getDeleteMark() {
        return deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.delete_mark
     *
     * @param deleteMark the value for stock_frozen_record.delete_mark
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.gmt_created
     *
     * @return the value of stock_frozen_record.gmt_created
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.gmt_created
     *
     * @param gmtCreated the value for stock_frozen_record.gmt_created
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_frozen_record.gmt_modified
     *
     * @return the value of stock_frozen_record.gmt_modified
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_frozen_record.gmt_modified
     *
     * @param gmtModified the value for stock_frozen_record.gmt_modified
     *
     * @mbggenerated Tue May 24 22:18:29 CST 2016
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}