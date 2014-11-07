package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Hotel;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class HotelUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3515435393987363335L;

	/** 
	 * ¾Æµê½á¹¹
	 */
	@ApiField("hotel")
	private Hotel hotel;

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Hotel getHotel( ) {
		return this.hotel;
	}

}
