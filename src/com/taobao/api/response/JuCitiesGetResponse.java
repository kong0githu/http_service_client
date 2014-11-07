package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.ju.cities.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:36.0
 */
public class JuCitiesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8787612475157933326L;

	/** 
	 * 返回城市名称列表类似 "上海","成都"
	 */
	@ApiListField("cities")
	@ApiField("string")
	private List<String> cities;

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public List<String> getCities( ) {
		return this.cities;
	}

}
