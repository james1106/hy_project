package com.mockuai.itemcenter.core.domain;

import java.util.Date;

public class RCategorySettlementDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_category_settlement.id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_category_settlement.category_level
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    private Integer categoryLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_category_settlement.category_id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    private Long categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_category_settlement.biz_code
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    private String bizCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_category_settlement.settlement_id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    private Long settlementId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_category_settlement.delete_mark
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    private Integer deleteMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_category_settlement.gmt_created
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    private Date gmtCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_category_settlement.gmt_modified
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_category_settlement.id
     *
     * @return the value of r_category_settlement.id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_category_settlement.id
     *
     * @param id the value for r_category_settlement.id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_category_settlement.category_level
     *
     * @return the value of r_category_settlement.category_level
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_category_settlement.category_level
     *
     * @param categoryLevel the value for r_category_settlement.category_level
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_category_settlement.category_id
     *
     * @return the value of r_category_settlement.category_id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_category_settlement.category_id
     *
     * @param categoryId the value for r_category_settlement.category_id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_category_settlement.biz_code
     *
     * @return the value of r_category_settlement.biz_code
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_category_settlement.biz_code
     *
     * @param bizCode the value for r_category_settlement.biz_code
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_category_settlement.settlement_id
     *
     * @return the value of r_category_settlement.settlement_id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public Long getSettlementId() {
        return settlementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_category_settlement.settlement_id
     *
     * @param settlementId the value for r_category_settlement.settlement_id
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_category_settlement.delete_mark
     *
     * @return the value of r_category_settlement.delete_mark
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public Integer getDeleteMark() {
        return deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_category_settlement.delete_mark
     *
     * @param deleteMark the value for r_category_settlement.delete_mark
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_category_settlement.gmt_created
     *
     * @return the value of r_category_settlement.gmt_created
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_category_settlement.gmt_created
     *
     * @param gmtCreated the value for r_category_settlement.gmt_created
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_category_settlement.gmt_modified
     *
     * @return the value of r_category_settlement.gmt_modified
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_category_settlement.gmt_modified
     *
     * @param gmtModified the value for r_category_settlement.gmt_modified
     *
     * @mbggenerated Tue Jan 19 10:06:45 CST 2016
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}