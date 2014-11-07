package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.schedule.rule.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbOrderScheduleRuleAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2653551678286895419L;

	/** 
	 * 新增成功的发货规则id
	 */
	@ApiField("schedule_rule_id")
	private Long scheduleRuleId;

	public void setScheduleRuleId(Long scheduleRuleId) {
		this.scheduleRuleId = scheduleRuleId;
	}
	public Long getScheduleRuleId( ) {
		return this.scheduleRuleId;
	}

}
