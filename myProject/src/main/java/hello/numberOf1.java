package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 18:34.
 */
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class numberOf1 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("对应的二进制为："+Integer.toBinaryString(n));
        System.out.println("其中包含1的个数："+ Integer.bitCount(n));
    }
}
