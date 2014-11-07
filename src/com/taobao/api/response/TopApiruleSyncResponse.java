package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Apirule;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.top.apirule.sync response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:37.0
 */
public class TopApiruleSyncResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6267534638249427782L;

	/** 
	 * api«Î«ÛπÊ‘Ú
	 */
	@ApiField("apirule")
	private Apirule apirule;

	public void setApirule(Apirule apirule) {
		this.apirule = apirule;
	}
	public Apirule getApirule( ) {
		return this.apirule;
	}

}
