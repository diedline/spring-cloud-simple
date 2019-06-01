
package com.cihon.changan.common.model.dto;

import java.io.Serializable;
import java.util.List;

import com.github.pagehelper.Page;

import lombok.Data;

@Data
public class Pagination<E> implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 总数
	 */
	private long total;

	/**
	 * 集合
	 */
	private List<E> list;

	public Pagination(List<E> list) {
		// 针对pagehelper 插件的初始化方 法
		if (list instanceof Page) {
			Page<E> page = (Page<E>) list;
			this.setTotal(page.getTotal());
			this.list = page;
		}
	}

}
