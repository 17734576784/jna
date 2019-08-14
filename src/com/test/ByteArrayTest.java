/**   
* @Title: ByteArrayTest.java 
* @Package com.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author dbr
* @date 2019年5月9日 上午10:57:29 
* @version V1.0   
*/
package com.test;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
/** 
* @ClassName: ByteArrayTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author dbr
* @date 2019年5月9日 上午10:57:29 
*  
*/
public class ByteArrayTest {
	public static void main(String[] args) throws IOException{
        String str="河北科林电气";

        //Unicode的编码就是UTF-16，每个字符占两个字节，UTF-8每个字符占3个字节
        ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes("UTF-16"));
        DataInputStream din = new DataInputStream(bais);
		System.out.println(din.available());
		System.out.println(din.readChar() + "1");
		System.out.println(din.readChar() + "2");
		System.out.println(din.readChar() + "3");
		System.out.println(din.readChar() + "4");
		System.out.println(din.readChar() + "5");


//        int len=bais.available();                            //之所以多了两个字节，是因为String串在最后有一个不可见的'\0'字符
//        System.out.println(len);
////		System.out.println(din.readChar() + "  " + din.readChar() + "ddd");
//
//        byte[] testread =new byte[6];                     
//        din.read(testread);
//        
//        
//        ByteBuffer bb = ByteBuffer.allocate(testread.length);//定义一个ByteBuffer，长度为字节数组长度                          
//        bb.put(testread);                                    //用testread初始化ByteBuffer
//        bb.flip();                                           //游标归0
//
//        Charset cs = Charset.forName ("UTF-16");             //定义编码
//        CharBuffer cb = cs.decode(bb);                       //将ByteBuffer转换为CharBuffer
//        char[] chs = cb.array();                             //读出CharBuffer中的字节
//
//
//        for(int i=0;i<chs.length;i++)
//            System.out.println(chs[i]);
//
//        if(chs[chs.length-1] == '\0')
//            System.out.println("最后一个字符表示空");         //表示最后一个字符是'\0'
//        else
//            System.out.println("最后一个字符非空");
    }
}
