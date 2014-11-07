package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.WlbOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.wlborder.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbWlborderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2115657532434873372L;

	/** 
	 * 物流宝订单详情
	 */
	@ApiField("wlb_order")
	private WlbOrder wlbOrder;

	public void setWlbOrder(WlbOrder wlbOrder) {
		this.wlbOrder = wlbOrder;
	}
	public WlbOrder getWlbOrder( ) {
		return this.wlbOrder;
	}

}
