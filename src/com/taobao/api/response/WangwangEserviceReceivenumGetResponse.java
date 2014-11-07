package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.ReplyStatOnDay;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wangwang.eservice.receivenum.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:40.0
 */
public class WangwangEserviceReceivenumGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4537412977863555543L;

	/** 
	 * 客服回复列表，按天统计，排列
	 */
	@ApiListField("reply_stat_list_on_days")
	@ApiField("reply_stat_on_day")
	private List<ReplyStatOnDay> replyStatListOnDays;

	public void setReplyStatListOnDays(List<ReplyStatOnDay> replyStatListOnDays) {
		this.replyStatListOnDays = replyStatListOnDays;
	}
	public List<ReplyStatOnDay> getReplyStatListOnDays( ) {
		return this.replyStatListOnDays;
	}

}
