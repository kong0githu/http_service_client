package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.authorization.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemAuthorizationAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6494557816821531182L;

	/** 
	 * ÊÚÈ¨¹ØÏµid
	 */
	@ApiField("rule_id")
	private Long ruleId;

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
	}
	public Long getRuleId( ) {
		return this.ruleId;
	}

}
