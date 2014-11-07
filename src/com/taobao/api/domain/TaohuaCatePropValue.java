package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘花类目属性值对象结构
 *
 * @author auto create
 * @since 1.0, 2011-03-25 17:22:18.0
 */
public class TaohuaCatePropValue extends TaobaoObject {

	private static final long serialVersionUID = 1321435251173153468L;

	/**
	 * 属性值
	 */
	@ApiField("prop_value")
	private String propValue;

	/**
	 * 属性值id
	 */
	@ApiField("value_id")
	private Long valueId;

	public String getPropValue() {
		return this.propValue;
	}
	public void setPropValue(String propValue) {
		this.propValue = propValue;
	}

	public Long getValueId() {
		return this.valueId;
	}
	public void setValueId(Long valueId) {
		this.valueId = valueId;
	}

}
