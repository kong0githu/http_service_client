package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.rule.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:34:02.0
 */
public class CrmRuleAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6638743744357217937L;

	/** 
	 * 返回规则添加是否成功
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
