package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.itemresurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaItemresurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1217224238349558393L;

	/** 
	 * œ¬‘ÿ¡¥Ω”µÿ÷∑.
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
