package com.mockuai.marketingcenter.common.domain.dto.mop;

public class SkuUidDTO {
    private Long skuId;
    private Long sellerId;

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }
}