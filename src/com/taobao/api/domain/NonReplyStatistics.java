package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * �ͷ�δ�ظ�ͳ��
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:00:43.0
 */
public class NonReplyStatistics extends TaobaoObject {

	private static final long serialVersionUID = 3122176812814112317L;

	/**
	 * �ͷ���Աδ�ظ��Ŀͻ�ID
	 */
	@ApiField("non_reply_customId")
	private String nonReplyCustomId;

	/**
	 * �ͷ�δ�ظ���
	 */
	@ApiField("non_reply_num")
	private Long nonReplyNum;

	/**
	 * �ͷ���ԱID
	 */
	@ApiField("service_staff_id")
	private String serviceStaffId;

	public String getNonReplyCustomId() {
		return this.nonReplyCustomId;
	}
	public void setNonReplyCustomId(String nonReplyCustomId) {
		this.nonReplyCustomId = nonReplyCustomId;
	}

	public Long getNonReplyNum() {
		return this.nonReplyNum;
	}
	public void setNonReplyNum(Long nonReplyNum) {
		this.nonReplyNum = nonReplyNum;
	}

	public String getServiceStaffId() {
		return this.serviceStaffId;
	}
	public void setServiceStaffId(String serviceStaffId) {
		this.serviceStaffId = serviceStaffId;
	}

}