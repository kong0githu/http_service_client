package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ju.groupids.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:50.0
 */
public class JuGroupidsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2857611324123498373L;

	/** 
	 * 获得商品组id列表
	 */
	@ApiListField("group_ids")
	@ApiField("number")
	private List<Long> groupIds;

	public void setGroupIds(List<Long> groupIds) {
		this.groupIds = groupIds;
	}
	public List<Long> getGroupIds( ) {
		return this.groupIds;
	}

}
