package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 客服评价统计
 *
 * @author auto create
 * @since 1.0, 2011-01-05 20:28:01.0
 */
public class StaffEvalStatistics extends TaobaoObject {

	private static final long serialVersionUID = 6668882354583348286L;

	/**
	 * 客服评价代码
	 */
	@ApiField("evaluations")
	private String evaluations;

	/**
	 * 客服人员ID
	 */
	@ApiField("service_staff_id")
	private String serviceStaffId;

	public String getEvaluations() {
		return this.evaluations;
	}
	public void setEvaluations(String evaluations) {
		this.evaluations = evaluations;
	}

	public String getServiceStaffId() {
		return this.serviceStaffId;
	}
	public void setServiceStaffId(String serviceStaffId) {
		this.serviceStaffId = serviceStaffId;
	}

}
