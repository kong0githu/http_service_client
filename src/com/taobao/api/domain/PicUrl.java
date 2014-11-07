package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Õº∆¨¡¥Ω”
 *
 * @author auto create
 * @since 1.0, 2010-08-18 10:37:25.0
 */
public class PicUrl extends TaobaoObject {

	private static final long serialVersionUID = 7298467331187236825L;

	/**
	 * Õº∆¨¡¥Ω”µÿ÷∑
	 */
	@ApiField("url")
	private String url;

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
