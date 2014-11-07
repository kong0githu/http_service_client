package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 发放成功的优惠券的信息，包括couponNumber和buyerNick
 *
 * @author auto create
 * @since 1.0, 2011-07-08 10:19:31.0
 */
public class CouponResult extends TaobaoObject {

	private static final long serialVersionUID = 1495211926152213782L;

	/**
	 * 张三
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 已经发放优惠券的编号
	 */
	@ApiField("coupon_number")
	private Long couponNumber;

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public Long getCouponNumber() {
		return this.couponNumber;
	}
	public void setCouponNumber(Long couponNumber) {
		this.couponNumber = couponNumber;
	}

}
