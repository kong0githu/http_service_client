package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SellerAuthorize;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.itemcats.authorize.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class ItemcatsAuthorizeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2139359257566298387L;

	/** 
	 * 里面有2个数组：
Brand[]品牌列表,
ItemCat[] 类目列表
	 */
	@ApiField("seller_authorize")
	private SellerAuthorize sellerAuthorize;

	public void setSellerAuthorize(SellerAuthorize sellerAuthorize) {
		this.sellerAuthorize = sellerAuthorize;
	}
	public SellerAuthorize getSellerAuthorize( ) {
		return this.sellerAuthorize;
	}

}
