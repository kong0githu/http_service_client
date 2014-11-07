package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.tradeorder.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbTradeorderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8356464199181227183L;

	/** 
	 * 物流宝订单列表信息
	 */
	@ApiListField("wlb_order_list")
	@ApiField("wlb_order")
	private List<WlbOrder> wlbOrderList;

	public void setWlbOrderList(List<WlbOrder> wlbOrderList) {
		this.wlbOrderList = wlbOrderList;
	}
	public List<WlbOrder> getWlbOrderList( ) {
		return this.wlbOrderList;
	}

}
