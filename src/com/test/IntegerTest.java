/**   
* @Title: IntegerTest.java 
* @Package com.test 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author dbr
* @date 2019��5��22�� ����9:20:24 
* @version V1.0   
*/
package com.test;

/**
 * @ClassName: IntegerTest
 * @Description: TODO(������һ�仰��������������)
 * @author dbr
 * @date 2019��5��22�� ����9:20:24
 * 
 */
public class IntegerTest {
	public static void main(String[] args) {
		System.out.println("<-128~127���ڵ�Integerֵ��Integer x = value;�ķ�ʽ��ֵ��>");
		Integer i = 127;
		Integer j = 127;
		System.out.println("i=" + i + ",j =" + j);
		System.out.println("i == j��" + (i == j) + "<--�Ƚ�-->i.equals(j):" + i.equals(j));
		System.out.println("<-128~127�����Integerֵ��Integer x = value;�ķ�ʽ��ֵ��>");
		Integer m = 128;
		Integer n = 128;
		System.out.println("m=" + m + ",n =" + n);
		System.out.println("m == n��" + (m == n) + "<--�Ƚ�-->m.equals(n):" + m.equals(n));
		System.out.println();
		System.out.println("<����Integerֵ��Integer x = new Integer(value);�ķ�ʽ��ֵ��>");
		Integer x = new Integer(299);
		int y = new Integer(299);
		System.out.println("x=" + x + ",y =" + y);
		System.out.println("x == y��" + (x == y) + "<--�Ƚ�-->x.equals(y):" + x.equals(y));
	}
}
