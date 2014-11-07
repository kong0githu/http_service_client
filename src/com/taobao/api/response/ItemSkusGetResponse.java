package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Sku;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.skus.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:26.0
 */
public class ItemSkusGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4218116986514387326L;

	/** 
	 * Sku¡–±Ì
	 */
	@ApiListField("skus")
	@ApiField("sku")
	private List<Sku> skus;

	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}
	public List<Sku> getSkus( ) {
		return this.skus;
	}

}
