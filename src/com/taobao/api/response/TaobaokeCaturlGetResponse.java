package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaobaokeItem;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.caturl.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class TaobaokeCaturlGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2896339698329684965L;

	/** 
	 * Ö»·µ»Øtaobaoke_cat_click_url
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
