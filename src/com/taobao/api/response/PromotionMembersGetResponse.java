package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Member;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.members.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:41.0
 */
public class PromotionMembersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4848655144933836913L;

	/** 
	 * 会员列表
	 */
	@ApiListField("members")
	@ApiField("member")
	private List<Member> members;

	/** 
	 * 一共有多少条
	 */
	@ApiField("tot_count")
	private Long totCount;

	public void setMembers(List<Member> members) {
		this.members = members;
	}
	public List<Member> getMembers( ) {
		return this.members;
	}

	public void setTotCount(Long totCount) {
		this.totCount = totCount;
	}
	public Long getTotCount( ) {
		return this.totCount;
	}

}
