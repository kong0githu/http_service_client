package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemAuthorizationAddResponse;

/**
 * TOP API: taobao.wlb.item.authorization.add request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemAuthorizationAddRequest implements TaobaoRequest<WlbItemAuthorizationAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 授权结束时间
	 */
	private Date authorizeEndTime;

	/** 
	* 授权开始时间
	 */
	private Date authorizeStartTime;

	/** 
	* 被授权人用户id
	 */
	private Long consignUserId;

	/** 
	* 商品id
	 */
	private Long itemId;

	/** 
	* 规则名称
	 */
	private String name;

	/** 
	* 授权数量
	 */
	private Long quantity;

	/** 
	* 授权规则：目前只有GRANT_FIX，按照数量授权
	 */
	private String ruleCode;

	public void setAuthorizeEndTime(Date authorizeEndTime) {
		this.authorizeEndTime = authorizeEndTime;
	}
	public Date getAuthorizeEndTime() {
		return this.authorizeEndTime;
	}

	public void setAuthorizeStartTime(Date authorizeStartTime) {
		this.authorizeStartTime = authorizeStartTime;
	}
	public Date getAuthorizeStartTime() {
		return this.authorizeStartTime;
	}

	public void setConsignUserId(Long consignUserId) {
		this.consignUserId = consignUserId;
	}
	public Long getConsignUserId() {
		return this.consignUserId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getQuantity() {
		return this.quantity;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}
	public String getRuleCode() {
		return this.ruleCode;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.authorization.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("authorize_end_time", this.authorizeEndTime);
		txtParams.put("authorize_start_time", this.authorizeStartTime);
		txtParams.put("consign_user_id", this.consignUserId);
		txtParams.put("item_id", this.itemId);
		txtParams.put("name", this.name);
		txtParams.put("quantity", this.quantity);
		txtParams.put("rule_code", this.ruleCode);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<WlbItemAuthorizationAddResponse> getResponseClass() {
		return WlbItemAuthorizationAddResponse.class;
	}
}
