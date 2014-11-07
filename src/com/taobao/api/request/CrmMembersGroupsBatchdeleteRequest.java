package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembersGroupsBatchdeleteResponse;

/**
 * TOP API: taobao.crm.members.groups.batchdelete request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:28:18.0
 */
public class CrmMembersGroupsBatchdeleteRequest implements TaobaoRequest<CrmMembersGroupsBatchdeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 买家的Id集合
	 */
	private String buyerIds;

	/** 
	* 会员需要删除的分组
	 */
	private String groupIds;

	public void setBuyerIds(String buyerIds) {
		this.buyerIds = buyerIds;
	}
	public String getBuyerIds() {
		return this.buyerIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}
	public String getGroupIds() {
		return this.groupIds;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.members.groups.batchdelete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_ids", this.buyerIds);
		txtParams.put("group_ids", this.groupIds);
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

	public Class<CrmMembersGroupsBatchdeleteResponse> getResponseClass() {
		return CrmMembersGroupsBatchdeleteResponse.class;
	}
}
