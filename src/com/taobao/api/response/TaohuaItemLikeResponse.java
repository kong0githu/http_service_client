package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.item.like response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:56.0
 */
public class TaohuaItemLikeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5362257515516277534L;

	/** 
	 * ³É¹¦·µ»Øsuccess
	 */
	@ApiField("like_result")
	private String likeResult;

	public void setLikeResult(String likeResult) {
		this.likeResult = likeResult;
	}
	public String getLikeResult( ) {
		return this.likeResult;
	}

}
