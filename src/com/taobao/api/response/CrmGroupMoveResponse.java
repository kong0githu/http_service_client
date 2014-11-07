package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.group.move response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:34:28.0
 */
public class CrmGroupMoveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1497751418327546953L;

	/** 
	 * 异步任务请求成功，是否执行完毕需要通过taobao.crm.grouptask.check检测
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
