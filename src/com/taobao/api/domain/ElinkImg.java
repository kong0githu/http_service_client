package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * E链通商品图片数据结构
 *
 * @author auto create
 * @since 1.0, 2011-06-09 09:55:05.0
 */
public class ElinkImg extends TaobaoObject {

	private static final long serialVersionUID = 5431667839334948794L;

	/**
	 * 图片创建时间 时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 商品图片的id，和商品相对应
	 */
	@ApiField("itemimg_id")
	private Long itemimgId;

	/**
	 * 图片放在第几张
	 */
	@ApiField("position")
	private Long position;

	/**
	 * 图片链接地址
	 */
	@ApiField("url")
	private String url;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getItemimgId() {
		return this.itemimgId;
	}
	public void setItemimgId(Long itemimgId) {
		this.itemimgId = itemimgId;
	}

	public Long getPosition() {
		return this.position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
