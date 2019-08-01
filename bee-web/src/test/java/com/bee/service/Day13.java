package com.bee.service;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by niujinliang on 2019/7/12.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class Day13 {

    @Test
    public void test1(){
        String s1="abc";
        String s2= new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    @Test
    public void String(){

        String str= "abcdefakp";
        //获取字符串长度
        System.out.println(str.length());

        /**
         *根据索引获取字符，如果超出字符长度，会报字符长度越界StringIndexOutOfBoundsException
         */
        System.out.println(str.charAt(3));

        /**
         * 根据字符获取索引,如果没有找到字符，返回-1
         */
        System.out.println(str.indexOf('a',4));

        /**
         * 根据字符反向索引，从右往左查找，找到了后，输出是第几个角标
         */
        System.out.println(str.lastIndexOf("a"));


    }
    @Test
    public void method_is(){
        String str= "ArrayDemo.java";
        /**
         * 判断文件是否以Array开头
         */
        System.out.println(str.startsWith("Array"));
        /**
         * 判断文件是否以.java结尾
         */
        System.out.println(str.endsWith(".java"));
        /**
         * 判断文件是否包含Demo
         */
        System.out.println(str.contains("Demo"));
    }

    @Test
    public void String_is(){
        String str="abc";
        /**
         * 判断字符串内容是否相等，不忽略大小写
         */
        System.out.println(str.equals("abc"));
        /**
         * 判断字符串内容是否相等，并且忽略大小写
         */
        System.out.println(str.equalsIgnoreCase("abc"));
    }

    @Test
    public void String_replace(){

        String s = "hello java";

        /**
         * 4、替换字符
         */
        System.out.println(s.replace('a','b'));
        System.out.println(s);

        /**
         * 4、替换字符串
         */
        System.out.println(s.replace("java","world"));
        System.out.println(s);
    }

    @Test
    public void method_split(){
        /**
         * 5、切割，以逗号截取，返回是一个数组
         */
        String s = "zhangsan,lisi,wangwu";
        String [] arr=s.split(",");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    @Test
    public void method_sub(){
        /**
         *6、子串，获取字符串中的一部分
         */
        String s= "abcdef";
        System.out.println(s.substring(2));//代表下标是2开始截取到最后
        System.out.println(s.substring(2,4));//代表下标2到下标4的部分,包含头不包含尾
        System.out.println(s.substring(0,s.length()));//代表从头到结尾

    }

    @Test
    public void method_7(){
        /**
         * 将字符串转成大写或者小写,不区分大小的比较的时候，思路是把字符串都转成小写，在进行比较
         */
        String s= "     Hello Java      ";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        /**
         * 将字符串两端的空格都去掉,没去掉中间的空格
         */

        System.out.println(s.trim());


        /**
         * 按顺序比较两个字符串的大小，相等是0，
         */

        String s1= "abc";
        String s2="aaa";
        System.out.println(s1.compareTo(s2));

    }

    //模拟一个trim功能一致的方法。去除字符串两端的空格
    @Test
    public String myTrim(String s){
        int start=0, end=s.length()-1;
        while (start<=end && s.charAt(start) == ' '){
            start++;
        }

        while (start<=end && s.charAt(end) ==' '){
            end--;
        }

        return s.substring(start,end+1);
    }
    @Test
    public void testMyTrim(){
        String s1="     ab cd      ";
        s1=myTrim(s1);
        System.out.println(s1);
    }


}
