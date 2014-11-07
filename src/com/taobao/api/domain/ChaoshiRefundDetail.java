package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商超子退款单
 *
 * @author auto create
 * @since 1.0, 2011-07-26 14:54:50.0
 */
public class ChaoshiRefundDetail extends TaobaoObject {

	private static final long serialVersionUID = 2792371914984448767L;

	/**
	 * 审核结果（0未审核 1卖家同意退货 2卖家拒绝退货）
	 */
	@ApiField("audit_result")
	private Long auditResult;

	/**
	 * 购买数量
	 */
	@ApiField("buy_amount")
	private Long buyAmount;

	/**
	 * 是否需要上门取货（1 需要，0 不需要）
	 */
	@ApiField("delivery_required")
	private Long deliveryRequired;

	/**
	 * 审核通过时间
	 */
	@ApiField("gmt_approved")
	private Date gmtApproved;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 退款单对应的子订单编号
	 */
	@ApiField("order_id")
	private Long orderId;

	/**
	 * 销售出库单号
	 */
	@ApiField("out_logistics_id")
	private String outLogisticsId;

	/**
	 * 物流宝退货单号
	 */
	@ApiField("out_refund_logistics_id")
	private String outRefundLogisticsId;

	/**
	 * 退款单退应的主订单编号
	 */
	@ApiField("parent_order_id")
	private Long parentOrderId;

	/**
	 * 主退款单编号
	 */
	@ApiField("parent_refund_id")
	private Long parentRefundId;

	/**
	 * 退货原因（1电退或拒收 2未及时收到货 3外包装损坏 4收到的货品不符 5商品质量问题 6折扣、赠品、发票问题 7其他）
	 */
	@ApiField("reason")
	private Long reason;

	/**
	 * 退货数量
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 退款金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款单编号
	 */
	@ApiField("refund_id")
	private Long refundId;

	/**
	 * 退款状态（0未退款、1退款成功、2退款失败）
	 */
	@ApiField("refund_status")
	private Long refundStatus;

	/**
	 * 退款时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 退货说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 协议状态
1. 退款协议等待卖家确认
2. 退款协议已经达成，等待买家退货。
3.买家已退货，等待卖家确认收货
4. 退款关闭
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 订单金额
	 */
	@ApiField("subtotal")
	private String subtotal;

	public Long getAuditResult() {
		return this.auditResult;
	}
	public void setAuditResult(Long auditResult) {
		this.auditResult = auditResult;
	}

	public Long getBuyAmount() {
		return this.buyAmount;
	}
	public void setBuyAmount(Long buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Long getDeliveryRequired() {
		return this.deliveryRequired;
	}
	public void setDeliveryRequired(Long deliveryRequired) {
		this.deliveryRequired = deliveryRequired;
	}

	public Date getGmtApproved() {
		return this.gmtApproved;
	}
	public void setGmtApproved(Date gmtApproved) {
		this.gmtApproved = gmtApproved;
	}

	public Date getGmtCreated() {
		return this.gmtCreated;
	}
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getOrderId() {
		return this.orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOutLogisticsId() {
		return this.outLogisticsId;
	}
	public void setOutLogisticsId(String outLogisticsId) {
		this.outLogisticsId = outLogisticsId;
	}

	public String getOutRefundLogisticsId() {
		return this.outRefundLogisticsId;
	}
	public void setOutRefundLogisticsId(String outRefundLogisticsId) {
		this.outRefundLogisticsId = outRefundLogisticsId;
	}

	public Long getParentOrderId() {
		return this.parentOrderId;
	}
	public void setParentOrderId(Long parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public Long getParentRefundId() {
		return this.parentRefundId;
	}
	public void setParentRefundId(Long parentRefundId) {
		this.parentRefundId = parentRefundId;
	}

	public Long getReason() {
		return this.reason;
	}
	public void setReason(Long reason) {
		this.reason = reason;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public Long getRefundId() {
		return this.refundId;
	}
	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(Long refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getSubtotal() {
		return this.subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

}
