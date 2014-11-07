package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商超子订单信息
 *
 * @author auto create
 * @since 1.0, 2011-08-01 10:40:20.0
 */
public class ChaoshiChildOrder extends TaobaoObject {

	private static final long serialVersionUID = 4451393285173267682L;

	/**
	 * 卖家修改价格时对单商品的价格调整
	 */
	@ApiField("adjust_fee")
	private String adjustFee;

	/**
	 * 宝贝itemId
	 */
	@ApiField("auction_id")
	private Long auctionId;

	/**
	 * 宝贝单价
	 */
	@ApiField("auction_price")
	private String auctionPrice;

	/**
	 * 宝贝标题
	 */
	@ApiField("auction_title")
	private String auctionTitle;

	/**
	 * 订单编号
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * 购买数量
	 */
	@ApiField("buy_amount")
	private Long buyAmount;

	/**
	 * 子订单赠送的积分数
	 */
	@ApiField("buyer_obtain_point")
	private Long buyerObtainPoint;

	/**
	 * 单商品的系统折扣，比如折扣券
	 */
	@ApiField("discount_fee")
	private String discountFee;

	/**
	 * 交易结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 业务失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 最后修改时间
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * 所属主订单的订单号。
如果下单时只有一个子订单，那么主订单Id值和子订单Id值相同
	 */
	@ApiField("parent_order_id")
	private Long parentOrderId;

	/**
	 * 返点比率。返回的数字表示千分之几，如返回20，表示返点比率是0.2%
	 */
	@ApiField("point_rate")
	private Long pointRate;

	/**
	 * 退款金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * SKU信息描述
	 */
	@ApiField("sku_properties")
	private String skuProperties;

	public String getAdjustFee() {
		return this.adjustFee;
	}
	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}

	public Long getAuctionId() {
		return this.auctionId;
	}
	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	public String getAuctionPrice() {
		return this.auctionPrice;
	}
	public void setAuctionPrice(String auctionPrice) {
		this.auctionPrice = auctionPrice;
	}

	public String getAuctionTitle() {
		return this.auctionTitle;
	}
	public void setAuctionTitle(String auctionTitle) {
		this.auctionTitle = auctionTitle;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBuyAmount() {
		return this.buyAmount;
	}
	public void setBuyAmount(Long buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Long getBuyerObtainPoint() {
		return this.buyerObtainPoint;
	}
	public void setBuyerObtainPoint(Long buyerObtainPoint) {
		this.buyerObtainPoint = buyerObtainPoint;
	}

	public String getDiscountFee() {
		return this.discountFee;
	}
	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Date getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Long getParentOrderId() {
		return this.parentOrderId;
	}
	public void setParentOrderId(Long parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public Long getPointRate() {
		return this.pointRate;
	}
	public void setPointRate(Long pointRate) {
		this.pointRate = pointRate;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getSkuProperties() {
		return this.skuProperties;
	}
	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}

}
