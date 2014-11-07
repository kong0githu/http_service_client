package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceChatlogGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatlog.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class WangwangEserviceChatlogGetRequest implements TaobaoRequest<WangwangEserviceChatlogGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 聊天消息终止时间，如2010-03-24
	 */
	private String endDate;

	/** 
	* 聊天消息被查询用户ID：cntaobao+淘宝nick，例如cntaobaotest
	 */
	private String fromId;

	/** 
	* 聊天消息起始时间，如2010-02-01
	 */
	private String startDate;

	/** 
	* 聊天消息相关方ID：cntaobao+淘宝nick，例如cntaobaotest
	 */
	private String toId;

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate() {
		return this.endDate;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}
	public String getFromId() {
		return this.fromId;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate() {
		return this.startDate;
	}

	public void setToId(String toId) {
		this.toId = toId;
	}
	public String getToId() {
		return this.toId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wangwang.eservice.chatlog.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_date", this.endDate);
		txtParams.put("from_id", this.fromId);
		txtParams.put("start_date", this.startDate);
		txtParams.put("to_id", this.toId);
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

	public Class<WangwangEserviceChatlogGetResponse> getResponseClass() {
		return WangwangEserviceChatlogGetResponse.class;
	}
}
