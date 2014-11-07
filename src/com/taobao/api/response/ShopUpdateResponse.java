package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Shop;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.shop.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:28.0
 */
public class ShopUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7334698486879157891L;

	/** 
	 * µÍ∆Ã–≈œ¢
	 */
	@ApiField("shop")
	private Shop shop;

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Shop getShop( ) {
		return this.shop;
	}

}
