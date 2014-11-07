package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * UMP中对元数据参数的定义
 *
 * @author auto create
 * @since 1.0, 2011-04-19 10:29:03.0
 */
public class ParameterDef extends TaobaoObject {

	private static final long serialVersionUID = 1392864121747595862L;

	/**
	 * 是否是数组
	 */
	@ApiField("array")
	private Boolean array;

	/**
	 * 逻辑类型,用来描述参数可接受的业务类型。
现在有且仅有如下几种：all,itemId,shopId,sellerId,skuId,categoryId,shopCategoryId
	 */
	@ApiField("logic_type")
	private String logicType;

	/**
	 * 参数名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参数值的类型。
现在有且仅有如下几种：string,date,boolean,double,long,resource(资源型元数据)
	 */
	@ApiField("value_type")
	private String valueType;

	public Boolean getArray() {
		return this.array;
	}
	public void setArray(Boolean array) {
		this.array = array;
	}

	public String getLogicType() {
		return this.logicType;
	}
	public void setLogicType(String logicType) {
		this.logicType = logicType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValueType() {
		return this.valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

}
