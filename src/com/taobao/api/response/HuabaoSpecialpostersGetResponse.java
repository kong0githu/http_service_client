package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Poster;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.huabao.specialposters.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:57.0
 */
public class HuabaoSpecialpostersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2276197116373427976L;

	/** 
	 * ª≠±®–≈œ¢
	 */
	@ApiListField("posters")
	@ApiField("poster")
	private List<Poster> posters;

	public void setPosters(List<Poster> posters) {
		this.posters = posters;
	}
	public List<Poster> getPosters( ) {
		return this.posters;
	}

}
