package com.cihon.changan.common.model.dto;

import lombok.Data;

@Data
public class Range<T> {

	/**
	 * 开始值
	 */
	private T startVal;
	/**
	 * 结束值（不包含）
	 */
	private T endVal;

	/**
	 * 范围名称
	 */
	private String name;

	public Range() {

	}

	public Range(T startVal, T endVal) {
		super();
		this.startVal = startVal;
		this.endVal = endVal;
		this.name = startVal + "-" + endVal;
	}

	public Range(T startVal, T endVal, String name) {
		super();
		this.startVal = startVal;
		this.endVal = endVal;
		this.name = name;
	}

}
