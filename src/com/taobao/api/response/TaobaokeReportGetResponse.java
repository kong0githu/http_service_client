package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaobaokeReport;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taobaoke.report.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:34.0
 */
public class TaobaokeReportGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3345713688763911833L;

	/** 
	 * ÌÔ±¦¿Í±¨±í
	 */
	@ApiField("taobaoke_report")
	private TaobaokeReport taobaokeReport;

	public void setTaobaokeReport(TaobaokeReport taobaokeReport) {
		this.taobaokeReport = taobaokeReport;
	}
	public TaobaokeReport getTaobaokeReport( ) {
		return this.taobaokeReport;
	}

}
