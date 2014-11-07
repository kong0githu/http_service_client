package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.rule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:33:53.0
 */
public class CrmRuleDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8775743412596427735L;

	/** 
	 * É¾³ýÊÇ·ñ³É¹¦
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
