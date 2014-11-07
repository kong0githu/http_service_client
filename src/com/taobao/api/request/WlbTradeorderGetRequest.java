package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbTradeorderGetResponse;

/**
 * TOP API: taobao.wlb.tradeorder.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:43.0
 */
public class WlbTradeorderGetRequest implements TaobaoRequest<WlbTradeorderGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 指定交易类型的交易号
	 */
	private String tradeId;

	/** 
	* 交易类型:
TAOBAO--淘宝交易
PAIPAI--拍拍交易
YOUA--有啊交易
	 */
	private String tradeType;

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getTradeType() {
		return this.tradeType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.tradeorder.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("trade_id", this.tradeId);
		txtParams.put("trade_type", this.tradeType);
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

	public Class<WlbTradeorderGetResponse> getResponseClass() {
		return WlbTradeorderGetResponse.class;
	}
}
