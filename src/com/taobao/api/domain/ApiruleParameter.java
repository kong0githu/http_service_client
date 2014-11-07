package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * api请求参数具体规则结构
 *
 * @author auto create
 * @since 1.0, 2011-01-10 12:12:05.0
 */
public class ApiruleParameter extends TaobaoObject {

	private static final long serialVersionUID = 3547773659338474838L;

	/**
	 * 当类型为byte[]时，支持的文件类型列表，以“,”分割。
	 */
	@ApiField("file_exts")
	private String fileExts;

	/**
	 * 最大长度。当类型为string、number、field_list时为字符长度，当类型为byte[]时为字节长度。
	 */
	@ApiField("length")
	private Long length;

	/**
	 * 基本类型以“;”号分割后的最大长度。
	 */
	@ApiField("max_list_size")
	private Long maxListSize;

	/**
	 * 当类型为number时的最大值
	 */
	@ApiField("max_value")
	private Long maxValue;

	/**
	 * 当类型为number时的最小值
	 */
	@ApiField("min_value")
	private Long minValue;

	/**
	 * 是否必传
	 */
	@ApiField("must")
	private Boolean must;

	/**
	 * aip的参数名
	 */
	@ApiField("name")
	private String name;

	/**
	 * api的参数类型。目前有 string、int、number、field_list、date、boolean、price、byte[] 8种
	 */
	@ApiField("type")
	private String type;

	public String getFileExts() {
		return this.fileExts;
	}
	public void setFileExts(String fileExts) {
		this.fileExts = fileExts;
	}

	public Long getLength() {
		return this.length;
	}
	public void setLength(Long length) {
		this.length = length;
	}

	public Long getMaxListSize() {
		return this.maxListSize;
	}
	public void setMaxListSize(Long maxListSize) {
		this.maxListSize = maxListSize;
	}

	public Long getMaxValue() {
		return this.maxValue;
	}
	public void setMaxValue(Long maxValue) {
		this.maxValue = maxValue;
	}

	public Long getMinValue() {
		return this.minValue;
	}
	public void setMinValue(Long minValue) {
		this.minValue = minValue;
	}

	public Boolean getMust() {
		return this.must;
	}
	public void setMust(Boolean must) {
		this.must = must;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
