/**   
* @Title: MainTest.java 
* @Package com.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author dbr
* @date 2019��6��4�� ����4:57:14 
* @version V1.0   
*/
package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** 
* @ClassName: MainTest 
* @Description: TODO(������һ�仰��������������) 
* @author dbr
* @date 2019��6��4�� ����4:57:14 
*  
*/
public class MainTest {
	public static void main(String[] args) {
		String[] strs = {"java8", "is", "easy", "to", "use"};
		List<String[]> distinctStrs = Arrays.stream(strs)
                .map(str -> str.split(""))  // ӳ���ΪStream<String[]>
                .distinct()
                .collect(Collectors.toList());
		
		distinctStrs.stream().forEach(str -> System.out.println(str));
 	}
}
