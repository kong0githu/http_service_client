package com.taobao.api.response;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.wlb.order.schedule.rule.update response.
 * 
 * @author auto create
 * @since 1.0, 2011-07-20 16:44:42.0
 */
public class WlbOrderScheduleRuleUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6731425521253425349L;

	/** 
	 * �޸�ʱ��
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

}
