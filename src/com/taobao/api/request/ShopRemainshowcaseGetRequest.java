package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ShopRemainshowcaseGetResponse;

/**
 * TOP API: taobao.shop.remainshowcase.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class ShopRemainshowcaseGetRequest implements TaobaoRequest<ShopRemainshowcaseGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.shop.remainshowcase.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
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

	public Class<ShopRemainshowcaseGetResponse> getResponseClass() {
		return ShopRemainshowcaseGetResponse.class;
	}
}
