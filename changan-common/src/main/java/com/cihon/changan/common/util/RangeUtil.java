package com.cihon.changan.common.util;

import java.util.ArrayList;
import java.util.List;

import com.cihon.changan.common.model.dto.Range;

public class RangeUtil {
	
	/**
	 * 获取 首次故障时间分布 的统计范围
	 */
	public static List<Range<Integer>> getFirstFaultRange() {
		List<Range<Integer>> list = new ArrayList<Range<Integer>>();
		list.add(new Range<Integer>(0, 31, "0-1"));
		list.add(new Range<Integer>(31, 61, "1-2"));
		list.add(new Range<Integer>(61, 91, "2-3"));
		list.add(new Range<Integer>(91, 121, "3-4"));
		list.add(new Range<Integer>(121, 151, "4-5"));
		list.add(new Range<Integer>(151, 181, "5-6"));
		list.add(new Range<Integer>(181, 211, "6-7"));
		list.add(new Range<Integer>(211, 241, "7-8"));
		list.add(new Range<Integer>(241, 271, "8-9"));
		list.add(new Range<Integer>(271, 301, "9-10"));
		list.add(new Range<Integer>(301, 331, "10-11"));
		list.add(new Range<Integer>(331, 361, "11-12"));
		list.add(new Range<Integer>(361, null, "12-"));
		return list;
	}

	/**
	 * 获取最大车速的统计范围
	 */
	public static List<Range<Integer>> getMaxSpeedRange() {
		List<Range<Integer>> list = new ArrayList<Range<Integer>>();
		list.add(new Range<Integer>(0, 70));
		list.add(new Range<Integer>(70, 80));
		list.add(new Range<Integer>(80, 90));
		list.add(new Range<Integer>(90, 100));
		list.add(new Range<Integer>(100, 110));
		list.add(new Range<Integer>(110, 120));
		list.add(new Range<Integer>(120, null, "120-"));
		return list;
	}
	
	/**
	 * 获取平均车速的统计范围
	 */
	public static List<Range<Integer>> getAvgSpeedRange() {
		List<Range<Integer>> list = new ArrayList<Range<Integer>>();
		list.add(new Range<Integer>(0, 20));
		list.add(new Range<Integer>(20, 40));
		list.add(new Range<Integer>(40, 60));
		list.add(new Range<Integer>(60, 80));
		list.add(new Range<Integer>(80, 100));
		list.add(new Range<Integer>(100, null, "100-"));
		return list;
	}

	/**
	 * 获取高速区间车速平稳性的统计范围
	 */
	public static List<Range<Integer>> getESpeedMRange() {
		List<Range<Integer>> list = new ArrayList<Range<Integer>>();
		list.add(new Range<Integer>(0, 2));
		list.add(new Range<Integer>(2, 4));
		list.add(new Range<Integer>(4, 6));
		list.add(new Range<Integer>(6, 8));
		list.add(new Range<Integer>(8, 10));
		list.add(new Range<Integer>(10, 1000));
		return list;
	}

	/**
	 * 获取油门踏板平均深度（起步状态）的统计范围
	 */
	public static List<Range<Integer>> getAPDepthStartRange() {
		List<Range<Integer>> list = new ArrayList<Range<Integer>>();
		list.add(new Range<Integer>(0, 20));
		list.add(new Range<Integer>(20, 40));
		list.add(new Range<Integer>(40, 60));
		list.add(new Range<Integer>(60, 80));
		list.add(new Range<Integer>(80, 100));
		return list;
	}

	/**
	 * 获取油门踏板方差（起步状态）的统计范围
	 */
	public static List<Range<Integer>> getAPVariaStartRange() {
		List<Range<Integer>> list = new ArrayList<Range<Integer>>();
		list.add(new Range<Integer>(0, 20));
		list.add(new Range<Integer>(20, 40));
		list.add(new Range<Integer>(40, 60));
		list.add(new Range<Integer>(60, 80));
		list.add(new Range<Integer>(80, 100));
		return list;
	}

	/**
	 * 获取 理想续使里程 的统计范围
	 */
	public static List<Range<Integer>> getIdealDrivingRangeRange() {
		List<Range<Integer>> list = new ArrayList<Range<Integer>>();
		list.add(new Range<Integer>(0, 100));
		list.add(new Range<Integer>(100, 150));
		list.add(new Range<Integer>(150, 200));
		list.add(new Range<Integer>(200, 250));
		list.add(new Range<Integer>(250, 300));
		list.add(new Range<Integer>(300, 350));
		list.add(new Range<Integer>(350, 400));
		list.add(new Range<Integer>(400, 450));
		list.add(new Range<Integer>(450, null, "450-"));
		return list;
	}

}
