package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.chatrecord.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class WangwangEserviceChatrecordGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4513127747829747129L;

	/** 
	 * 聊天日志文件下载url
	 */
	@ApiField("log_file_url")
	private String logFileUrl;

	public void setLogFileUrl(String logFileUrl) {
		this.logFileUrl = logFileUrl;
	}
	public String getLogFileUrl( ) {
		return this.logFileUrl;
	}

}
