package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * ISV订阅信息
 *
 * @author auto create
 * @since 1.0, 2010-12-08 13:21:45.0
 */
public class SubscribeMessage extends TaobaoObject {

	private static final long serialVersionUID = 3551436114232195412L;

	/**
	 * ISV的应用AppKey
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 此字段标记用户对于交易订单的过滤字段。字段格式key1:value1:key1name:value1name;key2:value2:key2name:value2name;……每个标记有4个部分：key(交易中标记的key)，value(交易中标记的value)，keyname(交易消息中标记的key的别名)，valuename(交易消息中标记的value的别名)，4个部分之间以冒号":"连接。不同标记之间以分号";"。连接默认此字段为空，表示不判断交易的标记，是要订阅的都存下来。如果此字段不为空，则根据定义的key和value对交易消息进行过滤。如果一个标记都没有命中，则此交易消息不被保存下来。
	 */
	@ApiField("attributes")
	private String attributes;

	/**
	 * ISV的订阅到期时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * ISV的订阅信息修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * ISV的主动发送消息列表。表示哪些消息需要主动发送给App。如果需要获取ISV的消息列表，传入notifyInfo即可
	 */
	@ApiListField("notify_infos")
	@ApiField("notify_info")
	private List<NotifyInfo> notifyInfos;

	/**
	 * App接受消息的地址
	 */
	@ApiField("notify_url")
	private String notifyUrl;

	/**
	 * ISV的订阅开始时间。订阅当天开始计算
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * ISV的订阅消息类型列表。如果需要获取ISV的授权列表，传入subscription即可
	 */
	@ApiListField("subscriptions")
	@ApiField("subscription")
	private List<Subscription> subscriptions;

	/**
	 * 应用所属的用户分类。目前一共分为3种：all(一个用户所有的消息都能接收，包扩用户作为卖家和作为买家所关联的消息);seller(只能接收一个用户作为卖家所关联的消息);buyer(只能接收一个用户作为买家所关联的消息)。默认是all。
目前的消息中，商品消息对此字段不敏感（不受买家卖家过滤），交易退款相关的消息会根据此字段进行存储
	 */
	@ApiField("user_role")
	private String userRole;

	/**
	 * ISV的订阅是否已经生效（生效表示能够正常接收消息等）
	 */
	@ApiField("valid")
	private Boolean valid;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAttributes() {
		return this.attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public List<NotifyInfo> getNotifyInfos() {
		return this.notifyInfos;
	}
	public void setNotifyInfos(List<NotifyInfo> notifyInfos) {
		this.notifyInfos = notifyInfos;
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Subscription> getSubscriptions() {
		return this.subscriptions;
	}
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public String getUserRole() {
		return this.userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Boolean getValid() {
		return this.valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

}
