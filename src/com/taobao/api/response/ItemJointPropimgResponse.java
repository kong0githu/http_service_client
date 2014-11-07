package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PropImg;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.joint.propimg response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:34.0
 */
public class ItemJointPropimgResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8856151395818219198L;

	/** 
	 * 属性图片对象信息
	 */
	@ApiField("prop_img")
	private PropImg propImg;

	public void setPropImg(PropImg propImg) {
		this.propImg = propImg;
	}
	public PropImg getPropImg( ) {
		return this.propImg;
	}

}
