package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Sku;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.sku.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:29.0
 */
public class ItemSkuDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3714366573466246272L;

	/** 
	 * Sku½á¹¹
	 */
	@ApiField("sku")
	private Sku sku;

	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Sku getSku( ) {
		return this.sku;
	}

}
