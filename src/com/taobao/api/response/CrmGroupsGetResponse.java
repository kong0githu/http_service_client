package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Group;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.groups.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:28:55.0
 */
public class CrmGroupsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2474227174353634993L;

	/** 
	 * 查询到的当前卖家的当前页的会员
	 */
	@ApiListField("groups")
	@ApiField("group")
	private List<Group> groups;

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	public List<Group> getGroups( ) {
		return this.groups;
	}

}
