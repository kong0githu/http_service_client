package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.TaohuaUpdateInfo;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.taohua.latestupdateinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:48.0
 */
public class TaohuaLatestupdateinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1831245889535426578L;

	/** 
	 * 更新信息版本号
	 */
	@ApiField("taohua_update_info")
	private TaohuaUpdateInfo taohuaUpdateInfo;

	public void setTaohuaUpdateInfo(TaohuaUpdateInfo taohuaUpdateInfo) {
		this.taohuaUpdateInfo = taohuaUpdateInfo;
	}
	public TaohuaUpdateInfo getTaohuaUpdateInfo( ) {
		return this.taohuaUpdateInfo;
	}

}
