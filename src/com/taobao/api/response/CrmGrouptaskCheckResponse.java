package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.grouptask.check response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:34:38.0
 */
public class CrmGrouptaskCheckResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8895745113126862828L;

	/** 
	 * 异步任务是否完成，true表示完成
	 */
	@ApiField("is_finished")
	private Boolean isFinished;

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}
	public Boolean getIsFinished( ) {
		return this.isFinished;
	}

}
