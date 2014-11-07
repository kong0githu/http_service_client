package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.PosterGoodsInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.huabao.poster.goodsinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:45.0
 */
public class HuabaoPosterGoodsinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5843627166825162285L;

	/** 
	 * 和画报相关的商品信息
	 */
	@ApiListField("goodsinfolist")
	@ApiField("poster_goods_info")
	private List<PosterGoodsInfo> goodsinfolist;

	public void setGoodsinfolist(List<PosterGoodsInfo> goodsinfolist) {
		this.goodsinfolist = goodsinfolist;
	}
	public List<PosterGoodsInfo> getGoodsinfolist( ) {
		return this.goodsinfolist;
	}

}
