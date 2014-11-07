package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FavoriteSearchResponse;

/**
 * TOP API: taobao.favorite.search request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class FavoriteSearchRequest implements TaobaoRequest<FavoriteSearchResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ITEM表示宝贝，SHOP表示商铺，collect_type只能为这两者之一
	 */
	private String collectType;

	/** 
	* 页码。取值范围:大于零的整数; 默认值:1。一页20条记录。
	 */
	private Long pageNo;

	/** 
	* 用户昵称
	 */
	private String userNick;

	public void setCollectType(String collectType) {
		this.collectType = collectType;
	}
	public String getCollectType() {
		return this.collectType;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserNick() {
		return this.userNick;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.favorite.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("collect_type", this.collectType);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("user_nick", this.userNick);
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

	public Class<FavoriteSearchResponse> getResponseClass() {
		return FavoriteSearchResponse.class;
	}
}
