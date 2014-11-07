package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * api请求规则
 *
 * @author auto create
 * @since 1.0, 2011-01-05 17:00:00.0
 */
public class Apirule extends TaobaoObject {

	private static final long serialVersionUID = 4336139335471632168L;

	/**
	 * api名称
	 */
	@ApiField("api_name")
	private String apiName;

	/**
	 * api请求参数具体规则结构
	 */
	@ApiListField("apirule_parameters")
	@ApiField("apirule_parameter")
	private List<ApiruleParameter> apiruleParameters;

	/**
	 * api请求参数规则最后修改时间
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * 是否需要session（即登录）
	 */
	@ApiField("need_session")
	private Boolean needSession;

	public String getApiName() {
		return this.apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public List<ApiruleParameter> getApiruleParameters() {
		return this.apiruleParameters;
	}
	public void setApiruleParameters(List<ApiruleParameter> apiruleParameters) {
		this.apiruleParameters = apiruleParameters;
	}

	public Date getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Boolean getNeedSession() {
		return this.needSession;
	}
	public void setNeedSession(Boolean needSession) {
		this.needSession = needSession;
	}

}
