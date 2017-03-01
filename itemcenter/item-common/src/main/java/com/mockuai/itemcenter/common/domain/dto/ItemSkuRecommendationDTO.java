package com.mockuai.itemcenter.common.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ItemSkuRecommendationDTO implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_sku_recommendation.id
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_sku_recommendation.seller_id
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    private Long sellerId;

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_sku_recommendation.biz_code
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    private String bizCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_sku_recommendation.sku_code
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    private String skuCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_sku_recommendation.delete_mark
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    private Integer deleteMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_sku_recommendation.gmt_created
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_sku_recommendation.gmt_modified
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_sku_recommendation.id
     *
     * @return the value of item_sku_recommendation.id
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_sku_recommendation.id
     *
     * @param id the value for item_sku_recommendation.id
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_sku_recommendation.seller_id
     *
     * @return the value of item_sku_recommendation.seller_id
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_sku_recommendation.seller_id
     *
     * @param sellerId the value for item_sku_recommendation.seller_id
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_sku_recommendation.sku_code
     *
     * @return the value of item_sku_recommendation.sku_code
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public String getSkuCode() {
        return skuCode;
    }

    public List<ItemSkuPropertyRecommendationDTO> getPropertyRecommendationDTOList() {
        return propertyRecommendationDTOList;
    }

    public void setPropertyRecommendationDTOList(List<ItemSkuPropertyRecommendationDTO> propertyRecommendationDTOList) {
        this.propertyRecommendationDTOList = propertyRecommendationDTOList;
    }

    private List<ItemSkuPropertyRecommendationDTO> propertyRecommendationDTOList;

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_sku_recommendation.sku_code
     *
     * @param skuCode the value for item_sku_recommendation.sku_code
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode == null ? null : skuCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_sku_recommendation.delete_mark
     *
     * @return the value of item_sku_recommendation.delete_mark
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public Integer getDeleteMark() {
        return deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_sku_recommendation.delete_mark
     *
     * @param deleteMark the value for item_sku_recommendation.delete_mark
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_sku_recommendation.gmt_created
     *
     * @return the value of item_sku_recommendation.gmt_created
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_sku_recommendation.gmt_created
     *
     * @param gmtCreated the value for item_sku_recommendation.gmt_created
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_sku_recommendation.gmt_modified
     *
     * @return the value of item_sku_recommendation.gmt_modified
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_sku_recommendation.gmt_modified
     *
     * @param gmtModified the value for item_sku_recommendation.gmt_modified
     *
     * @mbggenerated Mon Jan 11 09:06:20 CST 2016
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getBizCode() {
        return bizCode;
    }
}