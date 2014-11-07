package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 采购单明细
 *
 * @author auto create
 * @since 1.0, 2011-02-15 11:37:36.0
 */
public class PurchaseOrders extends TaobaoObject {

	private static final long serialVersionUID = 3146337872953647127L;

	/**
	 * 实际采购数量
	 */
	@ApiField("actual_num")
	private Long actualNum;

	/**
	 * 库存锁定期（以明细表为准）
	 */
	@ApiField("inventory_lockdays")
	private Long inventoryLockdays;

	/**
	 * 商品数字ID
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 商家编码
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 计划采购数量
	 */
	@ApiField("plans_num")
	private Long plansNum;

	/**
	 * 价损比例（以明细表为准）
	 */
	@ApiField("priceloss_scale")
	private String pricelossScale;

	/**
	 * 产品描述
	 */
	@ApiField("product_description")
	private String productDescription;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 采购明细ID
	 */
	@ApiField("purchase_detailsid")
	private Long purchaseDetailsid;

	/**
	 * 采购单编号（跟采购单主表关联）
	 */
	@ApiField("purchase_oid")
	private String purchaseOid;

	/**
	 * 进货价
	 */
	@ApiField("purchase_price")
	private String purchasePrice;

	/**
	 * 销售属性串（SKU属性）
	 */
	@ApiField("sku_properties")
	private String skuProperties;

	/**
	 * 库存锁定期结束时间
	 */
	@ApiField("stock_end")
	private Date stockEnd;

	/**
	 * 库存锁定期开始时间
	 */
	@ApiField("stock_start")
	private Date stockStart;

	/**
	 * 采购明细单总金额(进货价*计划采购数量)
	 */
	@ApiField("total_price")
	private String totalPrice;

	public Long getActualNum() {
		return this.actualNum;
	}
	public void setActualNum(Long actualNum) {
		this.actualNum = actualNum;
	}

	public Long getInventoryLockdays() {
		return this.inventoryLockdays;
	}
	public void setInventoryLockdays(Long inventoryLockdays) {
		this.inventoryLockdays = inventoryLockdays;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public Long getPlansNum() {
		return this.plansNum;
	}
	public void setPlansNum(Long plansNum) {
		this.plansNum = plansNum;
	}

	public String getPricelossScale() {
		return this.pricelossScale;
	}
	public void setPricelossScale(String pricelossScale) {
		this.pricelossScale = pricelossScale;
	}

	public String getProductDescription() {
		return this.productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getPurchaseDetailsid() {
		return this.purchaseDetailsid;
	}
	public void setPurchaseDetailsid(Long purchaseDetailsid) {
		this.purchaseDetailsid = purchaseDetailsid;
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

	public String getSkuProperties() {
		return this.skuProperties;
	}
	public void setSkuProperties(String skuProperties) {
		this.skuProperties = skuProperties;
	}

	public Date getStockEnd() {
		return this.stockEnd;
	}
	public void setStockEnd(Date stockEnd) {
		this.stockEnd = stockEnd;
	}

	public Date getStockStart() {
		return this.stockStart;
	}
	public void setStockStart(Date stockStart) {
		this.stockStart = stockStart;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

}
