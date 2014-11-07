package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.group.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:29:14.0
 */
public class CrmGroupAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1681256798967627945L;

	/** 
	 * 添加分组是否成功
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
