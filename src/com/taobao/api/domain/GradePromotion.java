package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 卖家设置的等级优惠信息
 *
 * @author auto create
 * @since 1.0, 2011-08-04 14:27:29.0
 */
public class GradePromotion extends TaobaoObject {

	private static final long serialVersionUID = 2693629431329885673L;

	/**
	 * 买家会员级别 general：普通会员 senior ：高级会员 vip：VIP会员 king：至尊VIP
	 */
	@ApiField("cur_grade")
	private String curGrade;

	/**
	 * 普通会员 、高级会员、VIP会员、至尊VIP
	 */
	@ApiField("cur_grade_name")
	private String curGradeName;

	/**
	 * 会员级别折扣率没有小数，990代表9.9折
	 */
	@ApiField("discount")
	private Long discount;

	/**
	 * 升级到下一个级别的需要的交易额，用分表示
	 */
	@ApiField("next_upgrade_amount")
	private Long nextUpgradeAmount;

	/**
	 * 升级到下一个级别的需要的交易量
	 */
	@ApiField("next_upgrade_count")
	private Long nextUpgradeCount;

	public String getCurGrade() {
		return this.curGrade;
	}
	public void setCurGrade(String curGrade) {
		this.curGrade = curGrade;
	}

	public String getCurGradeName() {
		return this.curGradeName;
	}
	public void setCurGradeName(String curGradeName) {
		this.curGradeName = curGradeName;
	}

	public Long getDiscount() {
		return this.discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public Long getNextUpgradeAmount() {
		return this.nextUpgradeAmount;
	}
	public void setNextUpgradeAmount(Long nextUpgradeAmount) {
		this.nextUpgradeAmount = nextUpgradeAmount;
	}

	public Long getNextUpgradeCount() {
		return this.nextUpgradeCount;
	}
	public void setNextUpgradeCount(Long nextUpgradeCount) {
		this.nextUpgradeCount = nextUpgradeCount;
	}

}
