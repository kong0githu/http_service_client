package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.track.auditionurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:58.0
 */
public class TaohuaAudioreaderTrackAuditionurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5564433239984249945L;

	/** 
	 * 有声读物单曲试听地址
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
