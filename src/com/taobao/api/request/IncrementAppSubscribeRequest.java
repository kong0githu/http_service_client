package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.IncrementAppSubscribeResponse;

/**
 * TOP API: taobao.increment.app.subscribe request
 * 
 * @author auto create
 * @since 1.0, 2011-08-04 11:26:23.0
 */
public class IncrementAppSubscribeRequest implements TaobaoRequest<IncrementAppSubscribeResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* ISV订阅服务时间，以月计算。目前可选值：1、3、6、12四种时间间隔。如果ISV属于淘宝的合作伙伴或者是自用型，可以选择订阅时间为-1（表示永久订阅）
	 */
	private Long duration;

	/** 
	* 要订阅的消息状态。可选值有：商品消息状态、退款消息状态、交易消息状态里面的状态类型。status字段支持多个状态同时订阅。每个大类的状态（商品消息状态里的所有消息状态属于同一个大类，退款消息状态里的所有消息状态属于同一个大类，交易消息状态里的所有消息状态属于同一个大类）要合并到一起传入。每个大类的消息内部用","连接，大类之间用";"连接。另，大类的排列顺序要和topics入参中类型的顺序一一对应，如果不传具体某个大类的消息而传入all，表示订阅这个大类下所有的消息状态。如：传入了topics="trade;refund;item"时：当传入status="all;all;all"表示我订阅者三种类型消息下的所有状态的消息；当传入status="TradeCreate,TradeSuccess;all;ItemDelete"表示我订阅交易类型下的交易创建和交易成功的消息，退款类型下的所有退款相关消息，商品下的商品删除的消息。
	 */
	private String status;

	/** 
	* 要订阅的消息类别。可多个类别同时订阅，每种类型之间以";"分隔。具体选值请见：增量消息类型说明。例如，如果要同时订阅交易，退款，商品的消息传入的字符串就是"trade;refund;item"
	 */
	private String topics;

	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getDuration() {
		return this.duration;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}
	public String getTopics() {
		return this.topics;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.increment.app.subscribe";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("duration", this.duration);
		txtParams.put("status", this.status);
		txtParams.put("topics", this.topics);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<IncrementAppSubscribeResponse> getResponseClass() {
		return IncrementAppSubscribeResponse.class;
	}
}
