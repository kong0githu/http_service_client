package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 销售明细表
 *
 * @author auto create
 * @since 1.0, 2011-02-28 12:37:25.0
 */
public class ReportOrder extends TaobaoObject {

	private static final long serialVersionUID = 6772974198828581147L;

	/**
	 * 商品描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 剩余数量
	 */
	@ApiField("lave_count")
	private Long laveCount;

	/**
	 * 商家编码
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 销售金额
	 */
	@ApiField("price")
	private String price;

	/**
	 * 进货数量
	 */
	@ApiField("purchase_count")
	private Long purchaseCount;

	/**
	 * 采购单编号
	 */
	@ApiField("purchase_oid")
	private String purchaseOid;

	/**
	 * 进货价
	 */
	@ApiField("purchase_price")
	private String purchasePrice;

	/**
	 * 采购时间
	 */
	@ApiField("purchase_time")
	private Date purchaseTime;

	/**
	 * 零售商名称
	 */
	@ApiField("retailers_name")
	private String retailersName;

	/**
	 * 销售数量
	 */
	@ApiField("sale_count")
	private Long saleCount;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 合作模式。*DISTRIBUTE(经销)*VENDOR(代销)
	 */
	@ApiField("tp_type")
	private String tpType;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getLaveCount() {
		return this.laveCount;
	}
	public void setLaveCount(Long laveCount) {
		this.laveCount = laveCount;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getPurchaseCount() {
		return this.purchaseCount;
	}
	public void setPurchaseCount(Long purchaseCount) {
		this.purchaseCount = purchaseCount;
	}

	public String getPurchaseOid() {
		return this.purchaseOid;
	}
	public void setPurchaseOid(String purchaseOid) {
		this.purchaseOid = purchaseOid;
	}

	public String getPurchasePrice() {
		return this.purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseTime() {
		return this.purchaseTime;
	}
	public void setPurchaseTime(Date purchaseTime) {
		this.purchaseTime = purchaseTime;
	}

	public String getRetailersName() {
		return this.retailersName;
	}
	public void setRetailersName(String retailersName) {
		this.retailersName = retailersName;
	}

	public Long getSaleCount() {
		return this.saleCount;
	}
	public void setSaleCount(Long saleCount) {
		this.saleCount = saleCount;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTpType() {
		return this.tpType;
	}
	public void setTpType(String tpType) {
		this.tpType = tpType;
	}

}
