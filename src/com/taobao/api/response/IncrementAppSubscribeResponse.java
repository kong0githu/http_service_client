package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SubscribeMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.app.subscribe response.
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 11:26:23.0
 */
public class IncrementAppSubscribeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5395959396182723388L;

	/** 
	 * ISVµÄ¶©¹ºÐÅÏ¢
	 */
	@ApiField("subscribe_message")
	private SubscribeMessage subscribeMessage;

	public void setSubscribeMessage(SubscribeMessage subscribeMessage) {
		this.subscribeMessage = subscribeMessage;
	}
	public SubscribeMessage getSubscribeMessage( ) {
		return this.subscribeMessage;
	}

}
