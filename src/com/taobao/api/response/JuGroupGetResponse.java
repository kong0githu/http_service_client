package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.GroupData;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ju.group.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class JuGroupGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2375695759838449932L;

	/** 
	 * 组信息的返回对象
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
