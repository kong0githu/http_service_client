package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 商品搜索
 *
 * @author auto create
 * @since 1.0, 2010-04-23 17:58:52.0
 */
public class ItemSearch extends TaobaoObject {

	private static final long serialVersionUID = 6538515486839515742L;

	/**
	 * 商品搜索分类
	 */
	@ApiListField("item_categories")
	@ApiField("item_category")
	private List<ItemCategory> itemCategories;

	/**
	 * 商品列表
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;

	public List<ItemCategory> getItemCategories() {
		return this.itemCategories;
	}
	public void setItemCategories(List<ItemCategory> itemCategories) {
		this.itemCategories = itemCategories;
	}

	public List<Item> getItems() {
		return this.items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}

}
