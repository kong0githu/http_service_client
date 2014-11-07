package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.track.downloadurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:55.0
 */
public class TaohuaAudioreaderTrackDownloadurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2544484171535395872L;

	/** 
	 * 有声读物单曲下载地址
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
