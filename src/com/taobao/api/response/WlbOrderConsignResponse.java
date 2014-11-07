package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.consign response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:42.0
 */
public class WlbOrderConsignResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7836346332716145856L;

	/** 
	 * ÐÞ¸ÄÊ±¼ä
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime( ) {
		return this.modifyTime;
	}

}
