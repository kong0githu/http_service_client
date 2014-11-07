package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaoCodeDetail;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taocode.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:31.0
 */
public class TaocodeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5596918278161229663L;

	/** 
	 * ฬิด๚ย๋ฯ๊ว้
	 */
	@ApiField("tao_code_detail")
	private TaoCodeDetail taoCodeDetail;

	public void setTaoCodeDetail(TaoCodeDetail taoCodeDetail) {
		this.taoCodeDetail = taoCodeDetail;
	}
	public TaoCodeDetail getTaoCodeDetail( ) {
		return this.taoCodeDetail;
	}

}
