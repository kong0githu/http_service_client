package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.StaffEvalStatOnDay;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.evaluation.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class WangwangEserviceEvaluationGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4869543884282952419L;

	/** 
	 * 客服平均统计列表
	 */
	@ApiListField("staff_eval_stat_on_days")
	@ApiField("staff_eval_stat_on_day")
	private List<StaffEvalStatOnDay> staffEvalStatOnDays;

	public void setStaffEvalStatOnDays(List<StaffEvalStatOnDay> staffEvalStatOnDays) {
		this.staffEvalStatOnDays = staffEvalStatOnDays;
	}
	public List<StaffEvalStatOnDay> getStaffEvalStatOnDays( ) {
		return this.staffEvalStatOnDays;
	}

}
