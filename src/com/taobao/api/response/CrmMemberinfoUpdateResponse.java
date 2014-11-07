package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.memberinfo.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:33:38.0
 */
public class CrmMemberinfoUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3361734657764531345L;

	/** 
	 * 会员信息修改是否成功
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
