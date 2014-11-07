package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 表示需要主动发送的消息信息
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:17:36.0
 */
public class NotifyInfo extends TaobaoObject {

	private static final long serialVersionUID = 7845712163888642669L;

	/**
	 * 增量消息的状态（隶属于主题）。具体选值请见：商品消息状态、退款消息状态、交易消息状态中的说明。isNotify应为隶属于topic类型的子类型，比如topic为trade，则isNotify应为TradeCreate
	 */
	@ApiField("is_notify")
	private String isNotify;

	/**
	 * 增量消息所属的主题。可选值 trade（交易类型） item（商品类型） refund（退款类型）
	 */
	@ApiField("topic")
	private String topic;

	public String getIsNotify() {
		return this.isNotify;
	}
	public void setIsNotify(String isNotify) {
		this.isNotify = isNotify;
	}

	public String getTopic() {
		return this.topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}

}
