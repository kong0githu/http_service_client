package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 虚仓订单明细表
 *
 * @author auto create
 * @since 1.0, 2011-07-12 13:48:04.0
 */
public class ElinkOrderLogistics extends TaobaoObject {

	private static final long serialVersionUID = 4123264299376432458L;

	/**
	 * 发票金额
	 */
	@ApiField("invoice_price")
	private String invoicePrice;

	/**
	 * 物料编码
	 */
	@ApiField("materials_id")
	private String materialsId;

	/**
	 * 商品数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 商品ID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 子订单编号
	 */
	@ApiField("oid")
	private Long oid;

	/**
	 * 商家编码
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 采购单编号
	 */
	@ApiField("purchase_oid")
	private String purchaseOid;

	/**
	 * 采购明细单ID
	 */
	@ApiField("purchase_order_id")
	private String purchaseOrderId;

	/**
	 * 供货价格
	 */
	@ApiField("purchase_price")
	private String purchasePrice;

	/**
	 * 零售商留言
	 */
	@ApiField("retailers_message")
	private String retailersMessage;

	/**
	 * 销售属性
	 */
	@ApiField("sku_properties")
	private String skuProperties;

	/**
	 * 物流订单状态。可选值：*WAIT_SEND_GOODS(等待发货)：*WAIT_CONFIRM_GOODS(已发货)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 淘宝订单ID
	 */
	@ApiField("tid")
	private Long tid;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 发货类型。*TRADE_GHS(供货商需发货订单);
	 */
	@ApiField("type")
	private String type;

	public String getInvoicePrice() {
		return this.invoicePrice;
	}
	public void setInvoicePrice(String invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	public String getMaterialsId() {
		return this.materialsId;
	}
	public void setMaterialsId(String materialsId) {
		this.materialsId = materialsId;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public Long getOid() {
		return this.oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPurchaseOid() {
		return this.purchaseOid;
	}
	public void setPurchaseOid(String purchaseOid) {
		this.purchaseOid = purchaseOid;
	}

	public String getPurchaseOrderId() {
		return this.purchaseOrderId;
	}
	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public String getPurchasePrice() {
		return this.purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getRetailersMessage() {
		return this.retailersMessage;
	}
	public void setRetailersMessage(String retailersMessage) {
		this.retailersMessage = retailersMessage;
	}

	public String getSkuProperties() {
		return this.skuProperties;
	}
	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
