package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.grade.set response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:27:44.0
 */
public class CrmGradeSetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8813421357621828342L;

	/** 
	 * true£º³É¹¦ false£ºÊ§°Ü
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
