package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Order;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.ordersku.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class TradeOrderskuUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5221449867998163764L;

	/** 
	 * Ö»·µ»ØoidºÍmodified
	 */
	@ApiField("order")
	private Order order;

	public void setOrder(Order order) {
		this.order = order;
	}
	public Order getOrder( ) {
		return this.order;
	}

}
