
package com.cihon.changan.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.cihon.changan.common.constant.DateContants;

public class DateUtils {
	/**
	 * 日志
	 */
	public static final Logger log = LoggerFactory.getLogger(DateUtils.class);

	public static Date getDelay(int delayDay) {
		GregorianCalendar d = new GregorianCalendar();
		d.add(Calendar.DATE, delayDay);
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.SECOND, 0);
		d.set(Calendar.MILLISECOND, 0);
		return d.getTime();
	}

	public static boolean equalDay(Date firstDate, Date secondDate) {
		boolean result = false;

		if (null == firstDate || null == secondDate || null == firstDate && null != secondDate
				|| null != firstDate && null == secondDate) {
			return result;
		}

		String firstDay = dateFormat(firstDate, DateContants.DATE_FORMAT_DAY);
		String secondDay = dateFormat(secondDate, DateContants.DATE_FORMAT_DAY);
		result = firstDay.equalsIgnoreCase(secondDay);

		return result;
	}

	/**
	 * 时间格式化,pattern为空时，默认格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @param d       d
	 * @param pattern pattern
	 * @return
	 */
	public static String dateFormat(Date d) {
		return dateFormat(d, null);
	}

	/**
	 * 时间格式化,pattern为空时，默认格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @param d       d
	 * @param pattern pattern
	 * @return
	 */
	public static String dateFormat(Date d, String pattern) {
		SimpleDateFormat format = null;
		if (pattern == null || "".equals(pattern)) {
			pattern = DateContants.DATE_FORMAT_ZH;
		}
		format = new SimpleDateFormat(pattern);
		String s = format.format(d);
		return s;
	}

	// 向前/后推一定时间周期后生成的新的时间方法
	public static String dateFormat(Date d, String pattern, int number) {
		String s = null;
		try {
			SimpleDateFormat format = null;
			if (pattern == null || "".equals(pattern))
				pattern = DateContants.DATE_FORMAT_ZH;
			format = new SimpleDateFormat(pattern);

			Calendar date = Calendar.getInstance();
			date.setTime(d);
			date.set(Calendar.DATE, date.get(Calendar.DATE) + number);
			Date endDate = format.parse(format.format(date.getTime()));
			s = format.format(endDate);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		return s;
	}

	public static Date parseDate(String date, String pattern) {
		if (StringUtils.isEmpty(date)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = null;

		try {
			d = sdf.parse(date);
		} catch (ParseException e) {
			log.error("日期" + date + "不符合格式：" + pattern);
		}
		return d;
	}

	public static Date strToDate(String s) {
		SimpleDateFormat sdf = new SimpleDateFormat(DateContants.DATE_FORMAT_ZH);
		Date d = null;
		if (s == null || "".equals(s.trim())) {
			return null;
		}
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			sdf = new SimpleDateFormat(DateContants.DATE_FORMAT_ZH);
			try {
				d = sdf.parse(s);
			} catch (ParseException e1) {
				return null;
			}
			return d;
		}
		return d;
	}

	/**
	 * 获取当天的开始时间
	 * 
	 * @return
	 */
	public static Date getToday() {
		GregorianCalendar d = new GregorianCalendar();
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.MILLISECOND, 0);
		d.set(Calendar.SECOND, 0);
		return d.getTime();
	}

	public static Date getYesterday() {
		GregorianCalendar d = new GregorianCalendar();
		d.set(Calendar.DAY_OF_MONTH, d.get(Calendar.DAY_OF_MONTH) - 1);
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.MILLISECOND, 0);
		d.set(Calendar.SECOND, 0);
		return d.getTime();
	}

	public static Date getPastDay(Integer days) {
		GregorianCalendar d = new GregorianCalendar();
		d.set(Calendar.DAY_OF_MONTH, d.get(Calendar.DAY_OF_MONTH) + 1 - days);
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.MILLISECOND, 0);
		d.set(Calendar.SECOND, 0);
		return d.getTime();
	}

	public static void main(String[] args) {
		System.out.println(getNextDay(new Date(), 1));
		System.out.println(getDaysAgo(1));
		System.out.println(getDaysAgo(2));
	}

	/**
	 * 描述： 返回当周的第一天
	 * 
	 * @return Date
	 */
	public static Date getCurrentWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 描述： 返回当月的第一天
	 * 
	 * @return Date
	 */
	public static Date getCurrentMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 描述： 返回之前的月份第一天
	 * 
	 * @return Date
	 */
	public static Date getMonthAgoFirstDay(int months) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -months);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date getMonthAgo(int months) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -months);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 描述： 返回当年的第一天
	 * 
	 * @return Date
	 */
	public static Date getCurrentYear() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date getDaysAgo(int days) {
		GregorianCalendar d = new GregorianCalendar();
		d.add(Calendar.DATE, -days);
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.SECOND, 0);
		d.set(Calendar.MILLISECOND, 0);
		return d.getTime();
	}

	/**
	 * 描述： 获取当月的第<code>day</code>天
	 * 
	 * @param day 当月的日期
	 * @return Date
	 */
	public static Date getDate(int day) {
		GregorianCalendar d = new GregorianCalendar();
		d.set(Calendar.DATE, day);
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.SECOND, 0);
		d.set(Calendar.MILLISECOND, 0);
		return d.getTime();
	}

	public static Date getNextDay(Date date) {
		return getNextDay(date,1);
	}

	public static Date getNextDay(Date date, Integer days) {
		GregorianCalendar d = new GregorianCalendar();
		d.setTime(date);
		d.set(Calendar.DAY_OF_MONTH, d.get(Calendar.DAY_OF_MONTH) + days);
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.SECOND, 0);
		d.set(Calendar.MILLISECOND, 0);

		return d.getTime();
	}

	public static Date getNextMonth(Date date, Integer months) {
		GregorianCalendar d = new GregorianCalendar();
		d.setTime(date);
		d.set(Calendar.MONTH, d.get(Calendar.MONTH) + months);
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.SECOND, 0);
		d.set(Calendar.MILLISECOND, 0);

		return d.getTime();
	}

	public static Date getNextYear(Date date, Integer years) {
		GregorianCalendar d = new GregorianCalendar();
		d.setTime(date);
		d.set(Calendar.YEAR, d.get(Calendar.YEAR) + years);
		d.set(Calendar.HOUR_OF_DAY, 0);
		d.set(Calendar.MINUTE, 0);
		d.set(Calendar.SECOND, 0);
		d.set(Calendar.MILLISECOND, 0);

		return d.getTime();
	}
}
