package com.mockuai.tradecenter.common.domain;

public class TradeConfigDTO extends BaseDTO{

	String bizCode;
	
	String attrKey;
	
	String attrValue;

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getAttrKey() {
		return attrKey;
	}

	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrValue() {
		return attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	
	
	
}
