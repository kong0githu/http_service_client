package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.promotion.meal.add response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:54.0
 */
public class PromotionMealAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4345315392392993657L;

	/** 
	 * true：成功 false：失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 搭配套餐id。
	 */
	@ApiField("meal_id")
	private Long mealId;

	/** 
	 * 创建时间。
	 */
	@ApiField("modify_time")
	private Date modifyTime;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}
	public Long getMealId( ) {
		return this.mealId;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime( ) {
		return this.modifyTime;
	}

}
