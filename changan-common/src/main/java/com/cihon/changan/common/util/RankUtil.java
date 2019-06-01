package com.cihon.changan.common.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.util.ReflectionUtils;

import com.cihon.changan.common.model.domain.UserDO;

/**
 * 计算排名服务
 * 
 * @author 86199
 *
 */
public class RankUtil {

	public static void main(String[] args) {
		List<UserDO> userList = new ArrayList<UserDO>();
		for (int i = 9; i > 0; i--) {
			UserDO ud = new UserDO();
			int num = RandomUtils.nextInt(10, 20);
			ud.setName("name" + i + num);
			ud.setStatus(num);
			userList.add(ud);
		}
		startDoubleRank(userList);
		userList.forEach(System.out::println);
	}

	/**
	 * @param list             要统计的list
	 * @param calPropertyName  计算排名的值
	 * @param rankPropertyName 排名的属性名
	 */
	public static <T> void startDoubleRank(List<T> list) {
		String calMethodName = "getStatus";
		String rankSetMethodName = "setGender";

		if (list != null && list.size() > 0) {
			Method calMethod = ReflectionUtils.findMethod(list.get(0).getClass(), calMethodName);
			Method rankSetMethod = ReflectionUtils.findMethod(list.get(0).getClass(), rankSetMethodName,Integer.class);
			// 排序
			list.sort((o1, o2) -> {
				Integer d1 =(Integer) ReflectionUtils.invokeMethod(calMethod, o1);
				Integer d2 = (Integer) ReflectionUtils.invokeMethod(calMethod, o2);
				return d1.compareTo(d2);
			});
			// 计算排名
			int previousRank = 0;
			for (int i = 0; i < list.size(); i++) {
				int currentRank = i + 1;
				if (i == 0) {
				} else {
					Object previousValue =  ReflectionUtils.invokeMethod(calMethod, list.get(i - 1));
					Object currentValue = ReflectionUtils.invokeMethod(calMethod, list.get(i));
					if (previousValue.equals(currentValue)) {
						currentRank = previousRank;
					} else {
						currentRank = i + 1;
					}
				}
				ReflectionUtils.invokeMethod(rankSetMethod, list.get(i), currentRank);
				previousRank = currentRank;
			}

		}
	}

}
