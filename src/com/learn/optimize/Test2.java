package com.learn.optimize;

/**
 * @author ：Kristen
 * @date ：2022/4/11
 * @description :
 */
public class Test2 {
    public static void main(String[] args) {
        String a = new String("abc").intern();
        String b = new String("abc").intern();
        if (a == b) {
            System.out.print("a==b");
        }
    }
}
