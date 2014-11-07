package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentPageGetResponse;

/**
 * TOP API: taobao.wlb.item.consignment.page.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemConsignmentPageGetRequest implements TaobaoRequest<WlbItemConsignmentPageGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 代销商商品id
	 */
	private Long itemId;

	/** 
	* 供应商商品id
	 */
	private Long tgtItemId;

	/** 
	* 供应商用户id
	 */
	private Long tgtUserId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Long getItemId() {
		return this.itemId;
	}

	public void setTgtItemId(Long tgtItemId) {
		this.tgtItemId = tgtItemId;
	}
	public Long getTgtItemId() {
		return this.tgtItemId;
	}

	public void setTgtUserId(Long tgtUserId) {
		this.tgtUserId = tgtUserId;
	}
	public Long getTgtUserId() {
		return this.tgtUserId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.wlb.item.consignment.page.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("tgt_item_id", this.tgtItemId);
		txtParams.put("tgt_user_id", this.tgtUserId);
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

	public Class<WlbItemConsignmentPageGetResponse> getResponseClass() {
		return WlbItemConsignmentPageGetResponse.class;
	}
}
