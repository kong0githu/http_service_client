package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.picture.delete response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:22.0
 */
public class PictureDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6391149518476819278L;

	/** 
	 * ÊÇ·ñÉ¾³ý
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
