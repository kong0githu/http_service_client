package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.domain.Meal;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.meal.get response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class PromotionMealGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4591983573732946859L;

	/** 
	 * ¥Ó≈‰Ã◊≤Õ¡–±Ì°£
	 */
	@ApiListField("meal_list")
	@ApiField("meal")
	private List<Meal> mealList;

	public void setMealList(List<Meal> mealList) {
		this.mealList = mealList;
	}
	public List<Meal> getMealList( ) {
		return this.mealList;
	}

}
