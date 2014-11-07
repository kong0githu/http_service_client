package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.boughtitem.is response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaBoughtitemIsResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7242839978189295445L;

	/** 
	 * 返回结果，true代表该商品已经被购买过，false代表该商品还没有被购买过
	 */
	@ApiField("is_bought")
	private Boolean isBought;

	public void setIsBought(Boolean isBought) {
		this.isBought = isBought;
	}
	public Boolean getIsBought( ) {
		return this.isBought;
	}

}
