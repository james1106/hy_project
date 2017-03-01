package com.mockuai.itemcenter.core.domain;

import java.util.Date;

public class ItemSuitDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.seller_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Long sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.biz_code
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private String bizCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.delete_mark
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Byte deleteMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.gmt_created
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.gmt_modified
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.suit_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Long suitId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.suit_sku_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Long suitSkuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.sale_begin
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Date saleBegin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.sale_end
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Date saleEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.sale_volume
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Long saleVolume;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_suit.status
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.id
     *
     * @return the value of item_suit.id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.id
     *
     * @param id the value for item_suit.id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.seller_id
     *
     * @return the value of item_suit.seller_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.seller_id
     *
     * @param sellerId the value for item_suit.seller_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.biz_code
     *
     * @return the value of item_suit.biz_code
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.biz_code
     *
     * @param bizCode the value for item_suit.biz_code
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.delete_mark
     *
     * @return the value of item_suit.delete_mark
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Byte getDeleteMark() {
        return deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.delete_mark
     *
     * @param deleteMark the value for item_suit.delete_mark
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setDeleteMark(Byte deleteMark) {
        this.deleteMark = deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.gmt_created
     *
     * @return the value of item_suit.gmt_created
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.gmt_created
     *
     * @param gmtCreated the value for item_suit.gmt_created
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.gmt_modified
     *
     * @return the value of item_suit.gmt_modified
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.gmt_modified
     *
     * @param gmtModified the value for item_suit.gmt_modified
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.suit_id
     *
     * @return the value of item_suit.suit_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Long getSuitId() {
        return suitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.suit_id
     *
     * @param suitId the value for item_suit.suit_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setSuitId(Long suitId) {
        this.suitId = suitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.suit_sku_id
     *
     * @return the value of item_suit.suit_sku_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Long getSuitSkuId() {
        return suitSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.suit_sku_id
     *
     * @param suitSkuId the value for item_suit.suit_sku_id
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setSuitSkuId(Long suitSkuId) {
        this.suitSkuId = suitSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.sale_begin
     *
     * @return the value of item_suit.sale_begin
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Date getSaleBegin() {
        return saleBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.sale_begin
     *
     * @param saleBegin the value for item_suit.sale_begin
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setSaleBegin(Date saleBegin) {
        this.saleBegin = saleBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.sale_end
     *
     * @return the value of item_suit.sale_end
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Date getSaleEnd() {
        return saleEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.sale_end
     *
     * @param saleEnd the value for item_suit.sale_end
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setSaleEnd(Date saleEnd) {
        this.saleEnd = saleEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.sale_volume
     *
     * @return the value of item_suit.sale_volume
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Long getSaleVolume() {
        return saleVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.sale_volume
     *
     * @param saleVolume the value for item_suit.sale_volume
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setSaleVolume(Long saleVolume) {
        this.saleVolume = saleVolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_suit.status
     *
     * @return the value of item_suit.status
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_suit.status
     *
     * @param status the value for item_suit.status
     *
     * @mbggenerated Wed Dec 09 21:30:07 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}