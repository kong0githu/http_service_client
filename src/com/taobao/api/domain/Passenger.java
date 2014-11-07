package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 乘机人信息
 *
 * @author auto create
 * @since 1.0, 2011-03-23 14:46:09.0
 */
public class Passenger extends TaobaoObject {

	private static final long serialVersionUID = 4564485297391367195L;

	/**
	 * 乘机人生日
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 机场建设费，单位分
	 */
	@ApiField("build_price")
	private Long buildPrice;

	/**
	 * 证件号码，只显示前三位和后四位，其余部分屏蔽
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * （0：身份证，1：护照，2：学生证，3：军人证，4：回乡证，5：台胞证，6：港澳台胞，7：国际海员，8：外国人永久居留证，9：其他）
	 */
	@ApiField("cert_type")
	private Long certType;

	/**
	 * 燃油附加税，单位分
	 */
	@ApiField("oil_price")
	private Long oilPrice;

	/**
	 * 乘机人标识
	 */
	@ApiField("passenger_id")
	private Long passengerId;

	/**
	 * 乘机人姓名
	 */
	@ApiField("passenger_name")
	private String passengerName;

	/**
	 * 乘机人联系电话
	 */
	@ApiField("passenger_phone")
	private String passengerPhone;

	/**
	 * PNR信息
	 */
	@ApiField("pnr")
	private String pnr;

	/**
	 * 票号
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 票价，单位分
	 */
	@ApiField("ticket_price")
	private Long ticketPrice;

	/**
	 * 票类型，0代表成人票，1代表儿童票
	 */
	@ApiField("ticket_type")
	private Long ticketType;

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Long getBuildPrice() {
		return this.buildPrice;
	}
	public void setBuildPrice(Long buildPrice) {
		this.buildPrice = buildPrice;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Long getCertType() {
		return this.certType;
	}
	public void setCertType(Long certType) {
		this.certType = certType;
	}

	public Long getOilPrice() {
		return this.oilPrice;
	}
	public void setOilPrice(Long oilPrice) {
		this.oilPrice = oilPrice;
	}

	public Long getPassengerId() {
		return this.passengerId;
	}
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return this.passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerPhone() {
		return this.passengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getPnr() {
		return this.pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public Long getTicketPrice() {
		return this.ticketPrice;
	}
	public void setTicketPrice(Long ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Long getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(Long ticketType) {
		this.ticketType = ticketType;
	}

}
