package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ju.itemids.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class JuItemidsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3732556413917883395L;

	/** 
	 * 返回的商品ID列表
	 */
	@ApiListField("item_ids")
	@ApiField("number")
	private List<Long> itemIds;

	public void setItemIds(List<Long> itemIds) {
		this.itemIds = itemIds;
	}
	public List<Long> getItemIds( ) {
		return this.itemIds;
	}

}
