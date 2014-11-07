package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PosterChannel;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.huabao.channel.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:34.0
 */
public class HuabaoChannelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2122818344863228641L;

	/** 
	 * ∆µµ¿–≈œ¢
	 */
	@ApiField("channel")
	private PosterChannel channel;

	public void setChannel(PosterChannel channel) {
		this.channel = channel;
	}
	public PosterChannel getChannel( ) {
		return this.channel;
	}

}
