package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * RoomType（房型）结构。各字段详细说明可参考接口定义，如：房型发布接口。
 *
 * @author auto create
 * @since 1.0, 2011-05-30 10:06:12.0
 */
public class RoomType extends TaobaoObject {

	private static final long serialVersionUID = 7857214496126495794L;

	/**
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 酒店id
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * 修改时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 房型名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 房型id
	 */
	@ApiField("rid")
	private Long rid;

	/**
	 * 状态。0：待审核，1：正常（审核通过），2：审核否决，3：停售
	 */
	@ApiField("status")
	private Long status;

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getRid() {
		return this.rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
