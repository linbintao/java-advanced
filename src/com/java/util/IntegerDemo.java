package com.java.util;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.lang.reflect.Array;

/**
 * Integer类的练习
 * @author 林斌涛
 * 2019.3.12
 */

public class IntegerDemo {
    public static void main(String[] args) {
        int num = 31;
        //调用Integer类的方法，将num进行进制转换
        //二进制
        String str1 = Integer.toBinaryString(num);
        System.out.println("二进制：" + str1);
        //十六进制
        String str2 = Integer.toHexString(num);
        System.out.println("十六进制：" + str2);
        //八进制
        String str3 = Integer.toOctalString(num);
        System.out.println("八进制：" + str3);
        System.out.println("-----------分割线，以下是自定义方法---------------");
        String str5 = convet(76, 2);
        System.out.println("31转二进制：" + str5);
    }

    private static String convet(int num, int radix) {
        //num转为radix进制
        StringBuffer stringBuffer = new StringBuffer();
        while (num != 0) {
            //求余数
            int r = num % radix;
            //更新被除数为商
            num = num / radix;
            //余数加入字符串
            stringBuffer.append(r);
        }
        //反转输出
        return new StringBuffer(stringBuffer).reverse().toString();
    }

    }








