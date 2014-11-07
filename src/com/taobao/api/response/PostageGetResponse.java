package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Postage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.postage.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:38.0
 */
public class PostageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1161918626434211941L;

	/** 
	 * ÔË·ÑÄ£°å
	 */
	@ApiField("postage")
	private Postage postage;

	public void setPostage(Postage postage) {
		this.postage = postage;
	}
	public Postage getPostage( ) {
		return this.postage;
	}

}
