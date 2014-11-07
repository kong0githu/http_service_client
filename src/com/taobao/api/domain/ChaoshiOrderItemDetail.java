package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商超订单详情中的子订单信息列表。
每个子订单信息包括：宝贝名称、SKU信息、状态、单价、购买数量、子订单号、宝贝ID等
 *
 * @author auto create
 * @since 1.0, 2011-08-01 10:41:30.0
 */
public class ChaoshiOrderItemDetail extends TaobaoObject {

	private static final long serialVersionUID = 1786911229633929186L;

	/**
	 * 每个宝贝的ItemId
	 */
	@ApiField("auction_id")
	private Long auctionId;

	/**
	 * 宝贝单价
	 */
	@ApiField("auction_price")
	private String auctionPrice;

	/**
	 * 商品标题
	 */
	@ApiField("auction_title")
	private String auctionTitle;

	/**
	 * 每笔子订单Id号
	 */
	@ApiField("biz_order_id")
	private Long bizOrderId;

	/**
	 * 每个宝贝的购买数量
	 */
	@ApiField("buy_amount")
	private Long buyAmount;

	/**
	 * 子订单退货的物流宝订单号
	 */
	@ApiField("refund_logistics_id")
	private String refundLogisticsId;

	/**
	 * 每个子订单的宝贝SKU
	 */
	@ApiField("sku_string")
	private String skuString;

	/**
	 * 每笔子订单的当前状态
	 */
	@ApiField("status")
	private String status;

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

	public String getRefundLogisticsId() {
		return this.refundLogisticsId;
	}
	public void setRefundLogisticsId(String refundLogisticsId) {
		this.refundLogisticsId = refundLogisticsId;
	}

	public String getSkuString() {
		return this.skuString;
	}
	public void setSkuString(String skuString) {
		this.skuString = skuString;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
