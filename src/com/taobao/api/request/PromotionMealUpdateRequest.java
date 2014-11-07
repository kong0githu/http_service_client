package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionMealUpdateResponse;

/**
 * TOP API: taobao.promotion.meal.update request
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:53.0
 */
public class PromotionMealUpdateRequest implements TaobaoRequest<PromotionMealUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 搭配套餐商品列表。item_id为商品的id(数字类型);item_show_name为商品显示名。最多允许5个商品进行搭配，最少是2个商品，且虚拟商品和拍卖商品不能参加套餐活动。以json格式传入。item_show_name最大长度为8,可以为空。
	 */
	private String itemList;

	/** 
	* 搭配套餐id
	 */
	private Long mealId;

	/** 
	* 套餐描述。
	 */
	private String mealMemo;

	/** 
	* 搭配套餐名称。(30个汉字以下)
	 */
	private String mealName;

	/** 
	* 搭配套餐一口价。这个值要大于0.01，小于商品的价值总和。
	 */
	private String mealPrice;

	/** 
	* 普通运费模板id。商品API:taobao.postages.get获取卖家的运费模板。
	 */
	private Long postageId;

	/** 
	* 运费模板类型。卖家标识'SELL';买家标识'BUY'。若为'SELL',则字段postage_id忽略。若为'BUY'，则postage_id为运费模板id，为必填项。
	 */
	private String typePostage;

	public void setItemList(String itemList) {
		this.itemList = itemList;
	}
	public String getItemList() {
		return this.itemList;
	}

	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}
	public Long getMealId() {
		return this.mealId;
	}

	public void setMealMemo(String mealMemo) {
		this.mealMemo = mealMemo;
	}
	public String getMealMemo() {
		return this.mealMemo;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}
	public String getMealName() {
		return this.mealName;
	}

	public void setMealPrice(String mealPrice) {
		this.mealPrice = mealPrice;
	}
	public String getMealPrice() {
		return this.mealPrice;
	}

	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}
	public Long getPostageId() {
		return this.postageId;
	}

	public void setTypePostage(String typePostage) {
		this.typePostage = typePostage;
	}
	public String getTypePostage() {
		return this.typePostage;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.promotion.meal.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_list", this.itemList);
		txtParams.put("meal_id", this.mealId);
		txtParams.put("meal_memo", this.mealMemo);
		txtParams.put("meal_name", this.mealName);
		txtParams.put("meal_price", this.mealPrice);
		txtParams.put("postage_id", this.postageId);
		txtParams.put("type_postage", this.typePostage);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<PromotionMealUpdateResponse> getResponseClass() {
		return PromotionMealUpdateResponse.class;
	}
}
