package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 粉丝列表中的对象
 *
 * @author auto create
 * @since 1.0, 2010-12-01 17:26:42.0
 */
public class FollowerInfo extends TaobaoObject {

	private static final long serialVersionUID = 8477272252617829871L;

	/**
	 * 用户的昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 用户的userid
	 */
	@ApiField("user_id")
	private Long userId;

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
