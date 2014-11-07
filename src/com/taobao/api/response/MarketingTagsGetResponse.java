package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.UserTag;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.marketing.tags.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:52.0
 */
public class MarketingTagsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6863695866698635191L;

	/** 
	 * ��ǩ�б�
	 */
	@ApiListField("user_tags")
	@ApiField("user_tag")
	private List<UserTag> userTags;

	public void setUserTags(List<UserTag> userTags) {
		this.userTags = userTags;
	}
	public List<UserTag> getUserTags( ) {
		return this.userTags;
	}

}