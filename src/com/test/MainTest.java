/**   
* @Title: MainTest.java 
* @Package com.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author dbr
* @date 2019年6月4日 下午4:57:14 
* @version V1.0   
*/
package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** 
* @ClassName: MainTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author dbr
* @date 2019年6月4日 下午4:57:14 
*  
*/
public class MainTest {
	public static void main(String[] args) {
		String[] strs = {"java8", "is", "easy", "to", "use"};
		List<String[]> distinctStrs = Arrays.stream(strs)
                .map(str -> str.split(""))  // 映射成为Stream<String[]>
                .distinct()
                .collect(Collectors.toList());
		
		distinctStrs.stream().forEach(str -> System.out.println(str));
 	}
}
