package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * E链通类目标准属性值
 *
 * @author auto create
 * @since 1.0, 2011-06-09 09:55:18.0
 */
public class ElinkPropValue extends TaobaoObject {

	private static final long serialVersionUID = 7822258437687157857L;

	/**
	 * 属性id
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * 属性值
	 */
	@ApiField("prop_name")
	private String propName;

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPropName() {
		return this.propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}

}
