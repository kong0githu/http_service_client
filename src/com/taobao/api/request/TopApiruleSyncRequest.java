package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopApiruleSyncResponse;

/**
 * TOP API: taobao.top.apirule.sync request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:37.0
 */
public class TopApiruleSyncRequest implements TaobaoRequest<TopApiruleSyncResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 已发布的api名称。
	 */
	private String apiName;

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getApiName() {
		return this.apiName;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.top.apirule.sync";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("api_name", this.apiName);
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

	public Class<TopApiruleSyncResponse> getResponseClass() {
		return TopApiruleSyncResponse.class;
	}
}
