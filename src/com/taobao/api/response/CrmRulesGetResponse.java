package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.RuleData;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.rules.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:21:54.0
 */
public class CrmRulesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5115786315264823266L;

	/** 
	 * 规则列表
	 */
	@ApiListField("rule_list")
	@ApiField("rule_data")
	private List<RuleData> ruleList;

	public void setRuleList(List<RuleData> ruleList) {
		this.ruleList = ruleList;
	}
	public List<RuleData> getRuleList( ) {
		return this.ruleList;
	}

}
