package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 分组简单定义
 *
 * @author auto create
 * @since 1.0, 2011-08-04 14:21:47.0
 */
public class GroupDomain extends TaobaoObject {

	private static final long serialVersionUID = 6433468857848446437L;

	/**
	 * 分组ID
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;

	public Long getGroupId() {
		return this.groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
