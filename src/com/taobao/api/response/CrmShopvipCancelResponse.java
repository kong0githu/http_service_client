package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.shopvip.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:20:14.0
 */
public class CrmShopvipCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2292357326662817435L;

	/** 
	 * 返回操作是否成功
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
