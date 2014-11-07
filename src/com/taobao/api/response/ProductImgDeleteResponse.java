package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.ProductImg;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.product.img.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:23.0
 */
public class ProductImgDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6868295465662233113L;

	/** 
	 * ·µ»ØproductimgÖÐµÄ£ºid,product_id
	 */
	@ApiField("product_img")
	private ProductImg productImg;

	public void setProductImg(ProductImg productImg) {
		this.productImg = productImg;
	}
	public ProductImg getProductImg( ) {
		return this.productImg;
	}

}
