package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.discount.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:37.0
 */
public class FenxiaoDiscountAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1574992113896945345L;

	/** 
	 * ’€ø€ID
	 */
	@ApiField("discount_id")
	private Long discountId;

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}
	public Long getDiscountId( ) {
		return this.discountId;
	}

}
