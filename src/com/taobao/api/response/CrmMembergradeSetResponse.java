package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.membergrade.set response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:26:48.0
 */
public class CrmMembergradeSetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6324798713546861179L;

	/** 
	 * 是否保存成功
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
