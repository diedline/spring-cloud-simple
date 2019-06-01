package com.cihon.changan.common.model.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 分页模型
 *
 * @author zouyutang
 * @date 2018/8/17
 * @package com.cihon.admin.model.dto
 */
@Data
public class Page implements Serializable {
	/**
	 * 总条数
	 */
	private int total;

	/**
	 * 集合
	 */
	private List<?> rows;

}
