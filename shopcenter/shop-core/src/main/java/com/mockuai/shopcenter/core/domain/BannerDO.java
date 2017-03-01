package com.mockuai.shopcenter.core.domain;

import java.util.Date;

public class BannerDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.seller_id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Long sellerId;


    private Long shopId;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.banner_type
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Integer bannerType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.banner_loaction
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Integer bannerLocation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.parent_type
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Integer parentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.parent_id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.image_url
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private String imageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.image_desc
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private String imageDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.url
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.biz_code
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private String bizCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.gmt_created
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.gmt_modified
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column banner.delete_mark
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    private Integer deleteMark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.id
     *
     * @return the value of banner.id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.id
     *
     * @param id the value for banner.id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.seller_id
     *
     * @return the value of banner.seller_id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.seller_id
     *
     * @param sellerId the value for banner.seller_id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.banner_type
     *
     * @return the value of banner.banner_type
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public Integer getBannerType() {
        return bannerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.banner_type
     *
     * @param bannerType the value for banner.banner_type
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setBannerType(Integer bannerType) {
        this.bannerType = bannerType;
    }

    public Integer getBannerLocation() {
        return bannerLocation;
    }

    public void setBannerLocation(Integer bannerLocation) {
        this.bannerLocation = bannerLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.parent_type
     *
     * @return the value of banner.parent_type
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public Integer getParentType() {
        return parentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.parent_type
     *
     * @param parentType the value for banner.parent_type
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.parent_id
     *
     * @return the value of banner.parent_id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.parent_id
     *
     * @param parentId the value for banner.parent_id
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.image_url
     *
     * @return the value of banner.image_url
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.image_url
     *
     * @param imageUrl the value for banner.image_url
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.image_desc
     *
     * @return the value of banner.image_desc
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public String getImageDesc() {
        return imageDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.image_desc
     *
     * @param imageDesc the value for banner.image_desc
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc == null ? null : imageDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.url
     *
     * @return the value of banner.url
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.url
     *
     * @param url the value for banner.url
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.biz_code
     *
     * @return the value of banner.biz_code
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.biz_code
     *
     * @param bizCode the value for banner.biz_code
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.gmt_created
     *
     * @return the value of banner.gmt_created
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.gmt_created
     *
     * @param gmtCreated the value for banner.gmt_created
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.gmt_modified
     *
     * @return the value of banner.gmt_modified
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.gmt_modified
     *
     * @param gmtModified the value for banner.gmt_modified
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column banner.delete_mark
     *
     * @return the value of banner.delete_mark
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public Integer getDeleteMark() {
        return deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column banner.delete_mark
     *
     * @param deleteMark the value for banner.delete_mark
     *
     * @mbggenerated Mon Jan 11 18:41:21 CST 2016
     */
    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }
}