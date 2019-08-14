/**   
* @Title: DllTest.java 
* @Package com.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author dbr
* @date 2019��5��8�� ����4:29:57 
* @version V1.0   
*/
package com.test;

import com.sun.jna.Library;
import com.sun.jna.Native;

/** 
* @ClassName: DllTest 
* @Description: TODO(������һ�仰��������������) 
* @author dbr
* @date 2019��5��8�� ����4:29:57 
*  
*/
public class DllTest {
	
	public interface Dll extends Library{		
		Dll instance = (Dll)Native.load("com/test/DllSum", Dll.class);
		public int add(int a,int b);
		public int substract(int a,int b);
		public void printHello();
	}

	public static void main(String[] args) {
		int sum = Dll.instance.add(5, 3);
		int sub = Dll.instance.substract(5, 3);
		System.out.println("add(5,3) = "+sum);
		System.out.println("substract(5,3) = "+sub);
		Dll.instance.printHello();
	}
}
