package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuCatitemidsGetResponse;

/**
 * TOP API: taobao.ju.catitemids.get request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class JuCatitemidsGetRequest implements TaobaoRequest<JuCatitemidsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 商品子类目ID。男装:100001,女装:100002。更多类目信息获取可以联系聚划算PD保义
	 */
	private Long childCategoryid;

	/** 
	* 分页获取商品信息页序号，代表第几页
	 */
	private Long pageNo;

	/** 
	* 每次获取商品列表的数量
	 */
	private Long pageSize;

	/** 
	* 商品父类目ID。服装:100000,保险:1000000。更多类目信息获取可以联系聚划算PD保义
	 */
	private Long parentCategoryid;

	/** 
	* 平台ID。搜狗:1008,聚划算:1001,商城:1002,无线WAP:1007,支付宝:1003,淘宝天下:1004,嗨淘:1006
	 */
	private Long platformId;

	/** 
	* IPHONE,WAP,ANDROID,SINA,163 各种终端类型
	 */
	private String terminalType;

	public void setChildCategoryid(Long childCategoryid) {
		this.childCategoryid = childCategoryid;
	}
	public Long getChildCategoryid() {
		return this.childCategoryid;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setParentCategoryid(Long parentCategoryid) {
		this.parentCategoryid = parentCategoryid;
	}
	public Long getParentCategoryid() {
		return this.parentCategoryid;
	}

	public void setPlatformId(Long platformId) {
		this.platformId = platformId;
	}
	public Long getPlatformId() {
		return this.platformId;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public String getTerminalType() {
		return this.terminalType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ju.catitemids.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("child_categoryid", this.childCategoryid);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("parent_categoryid", this.parentCategoryid);
		txtParams.put("platform_id", this.platformId);
		txtParams.put("terminal_type", this.terminalType);
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

	public Class<JuCatitemidsGetResponse> getResponseClass() {
		return JuCatitemidsGetResponse.class;
	}
}
