package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaobaokeItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.listurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:34.0
 */
public class TaobaokeListurlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8481153939697628756L;

	/** 
	 * Ö»·µ»Økeyword_click_url
	 */
	@ApiField("taobaoke_item")
	private TaobaokeItem taobaokeItem;

	public void setTaobaokeItem(TaobaokeItem taobaokeItem) {
		this.taobaokeItem = taobaokeItem;
	}
	public TaobaokeItem getTaobaokeItem( ) {
		return this.taobaokeItem;
	}

}
