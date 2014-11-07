package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.members.groups.batchdelete response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:28:18.0
 */
public class CrmMembersGroupsBatchdeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4363778245514187667L;

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
