package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.GuarantyfundsGetResponse;

/**
 * TOP API: taobao.guarantyfunds.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:22.0
 */
public class GuarantyfundsGetRequest implements TaobaoRequest<GuarantyfundsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询保证金操作记录创建时间开始，格式为:yyyy-MM-dd
	 */
	private Date beginDate;

	/** 
	* 查询保证金操作记录创建时间结束，格式为:yyyy-MM-dd
	 */
	private Date endDate;

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getBeginDate() {
		return this.beginDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.guarantyfunds.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("begin_date", this.beginDate);
		txtParams.put("end_date", this.endDate);
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

	public Class<GuarantyfundsGetResponse> getResponseClass() {
		return GuarantyfundsGetResponse.class;
	}
}
