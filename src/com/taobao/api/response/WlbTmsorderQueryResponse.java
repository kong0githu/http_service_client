package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.WlbTmsOrder;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.tmsorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbTmsorderQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7449647279583774378L;

	/** 
	 * ���������˵���Ϣ�б�
	 */
	@ApiListField("tms_order_list")
	@ApiField("wlb_tms_order")
	private List<WlbTmsOrder> tmsOrderList;

	/** 
	 * �������
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setTmsOrderList(List<WlbTmsOrder> tmsOrderList) {
		this.tmsOrderList = tmsOrderList;
	}
	public List<WlbTmsOrder> getTmsOrderList( ) {
		return this.tmsOrderList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}