package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.PosterChannel;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.huabao.channels.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:24.0
 */
public class HuabaoChannelsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1549444227323492118L;

	/** 
	 * 类目信息
	 */
	@ApiListField("channels")
	@ApiField("poster_channel")
	private List<PosterChannel> channels;

	public void setChannels(List<PosterChannel> channels) {
		this.channels = channels;
	}
	public List<PosterChannel> getChannels( ) {
		return this.channels;
	}

}
