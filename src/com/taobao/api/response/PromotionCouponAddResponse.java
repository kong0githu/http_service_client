package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.coupon.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-27 18:28:18.0
 */
public class PromotionCouponAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4689231943833938534L;

	/** 
	 * ÓÅ»ÝÈ¯µÄid
	 */
	@ApiField("coupon_id")
	private Long couponId;

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	public Long getCouponId( ) {
		return this.couponId;
	}

}
