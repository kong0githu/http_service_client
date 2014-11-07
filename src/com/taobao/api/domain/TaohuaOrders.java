package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 淘花订单列表
 *
 * @author auto create
 * @since 1.0, 2011-01-21 12:48:49.0
 */
public class TaohuaOrders extends TaobaoObject {

	private static final long serialVersionUID = 2463934291642596682L;

	/**
	 * 淘花用户已买到订单列表数据结构
	 */
	@ApiListField("taohua_orders")
	@ApiField("taohua_order")
	private List<TaohuaOrder> taohuaOrders;

	/**
	 * 返回的订单列表的总数
	 */
	@ApiField("total_order")
	private Long totalOrder;

	public List<TaohuaOrder> getTaohuaOrders() {
		return this.taohuaOrders;
	}
	public void setTaohuaOrders(List<TaohuaOrder> taohuaOrders) {
		this.taohuaOrders = taohuaOrders;
	}

	public Long getTotalOrder() {
		return this.totalOrder;
	}
	public void setTotalOrder(Long totalOrder) {
		this.totalOrder = totalOrder;
	}

}
