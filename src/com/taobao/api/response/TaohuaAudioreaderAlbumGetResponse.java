package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaAudioReaderAlbum;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.audioreader.album.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class TaohuaAudioreaderAlbumGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4297539648383431678L;

	/** 
	 * ÓÐÉù¶ÁÎï×¨¼­
	 */
	@ApiField("audioreader_album")
	private TaohuaAudioReaderAlbum audioreaderAlbum;

	public void setAudioreaderAlbum(TaohuaAudioReaderAlbum audioreaderAlbum) {
		this.audioreaderAlbum = audioreaderAlbum;
	}
	public TaohuaAudioReaderAlbum getAudioreaderAlbum( ) {
		return this.audioreaderAlbum;
	}

}
