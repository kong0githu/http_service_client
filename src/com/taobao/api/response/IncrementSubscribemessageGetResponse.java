package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.SubscribeMessage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.increment.subscribemessage.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:25.0
 */
public class IncrementSubscribemessageGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1126913294562517117L;

	/** 
	 * ISV增量消息订阅信息
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
