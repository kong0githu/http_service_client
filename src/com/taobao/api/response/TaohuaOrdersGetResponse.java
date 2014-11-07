package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaOrders;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.orders.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class TaohuaOrdersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4577392233911826913L;

	/** 
	 * 淘花订单列表数据结构对象
	 */
	@ApiField("taohua_order_result")
	private TaohuaOrders taohuaOrderResult;

	public void setTaohuaOrderResult(TaohuaOrders taohuaOrderResult) {
		this.taohuaOrderResult = taohuaOrderResult;
	}
	public TaohuaOrders getTaohuaOrderResult( ) {
		return this.taohuaOrderResult;
	}

}
