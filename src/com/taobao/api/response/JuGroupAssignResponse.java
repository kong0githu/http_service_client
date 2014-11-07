package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.GroupData;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ju.group.assign response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class JuGroupAssignResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3232875475467436947L;

	/** 
	 * 返回单个组信息
	 */
	@ApiField("group")
	private GroupData group;

	public void setGroup(GroupData group) {
		this.group = group;
	}
	public GroupData getGroup( ) {
		return this.group;
	}

}
