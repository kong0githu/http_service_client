package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.favorite.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:44.0
 */
public class FavoriteAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6112757489713789444L;

	/** 
	 * 是否收藏成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
