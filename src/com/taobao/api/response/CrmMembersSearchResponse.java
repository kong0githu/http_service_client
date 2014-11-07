package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.CrmMember;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.crm.members.search response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 14:33:27.0
 */
public class CrmMembersSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6688781869713241913L;

	/** 
	 * 根据一定条件查询的卖家会员
	 */
	@ApiListField("members")
	@ApiField("crm_member")
	private List<CrmMember> members;

	public void setMembers(List<CrmMember> members) {
		this.members = members;
	}
	public List<CrmMember> getMembers( ) {
		return this.members;
	}

}
