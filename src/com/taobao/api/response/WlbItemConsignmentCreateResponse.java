package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.consignment.create response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemConsignmentCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8456416453242555453L;

	/** 
	 * 代销关系唯一标识
	 */
	@ApiField("consignment_id")
	private Long consignmentId;

	public void setConsignmentId(Long consignmentId) {
		this.consignmentId = consignmentId;
	}
	public Long getConsignmentId( ) {
		return this.consignmentId;
	}

}
