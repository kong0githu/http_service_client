package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trades.bought.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class TradesBoughtGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4645619341764785524L;

	/** 
	 * 搜索到的交易信息总数
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * 搜索到的交易信息列表，返回的Trade和Order中包含的具体信息为入参fields请求的字段信息
	 */
	@ApiListField("trades")
	@ApiField("trade")
	private List<Trade> trades;

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public void setTrades(List<Trade> trades) {
		this.trades = trades;
	}
	public List<Trade> getTrades( ) {
		return this.trades;
	}

}
