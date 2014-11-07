package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.time.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:33.0
 */
public class TimeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2765366591887461296L;

	/** 
	 * 淘宝系统当前时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time")
	private Date time;

	public void setTime(Date time) {
		this.time = time;
	}
	public Date getTime( ) {
		return this.time;
	}

}
