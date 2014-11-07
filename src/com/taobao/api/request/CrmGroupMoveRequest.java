package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGroupMoveResponse;

/**
 * TOP API: taobao.crm.group.move request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:34:28.0
 */
public class CrmGroupMoveRequest implements TaobaoRequest<CrmGroupMoveResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 需要移动的分组
	 */
	private Long fromGroupId;

	/** 
	* 目的分组
	 */
	private Long toGroupId;

	public void setFromGroupId(Long fromGroupId) {
		this.fromGroupId = fromGroupId;
	}
	public Long getFromGroupId() {
		return this.fromGroupId;
	}

	public void setToGroupId(Long toGroupId) {
		this.toGroupId = toGroupId;
	}
	public Long getToGroupId() {
		return this.toGroupId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.group.move";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("from_group_id", this.fromGroupId);
		txtParams.put("to_group_id", this.toGroupId);
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

	public Class<CrmGroupMoveResponse> getResponseClass() {
		return CrmGroupMoveResponse.class;
	}
}
