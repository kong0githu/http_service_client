package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.item.combination.create response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:47.0
 */
public class WlbItemCombinationCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7819133976367259541L;

	/** 
	 * 组合关系创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

}
