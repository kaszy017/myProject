package move;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-10 11:49.
 */
public class Move {
    /**
     * 反转字符串（循环交换）
     * 其他字符串反转的方法
     * 1、java的api：StringBuffer的reverse方法
     * 2、利用栈的特性（先进后出）
     * 3、反向遍历字符串
     * @param from
     * @return
     */
    public static String reChange(String from){
        char[] froms = from.toCharArray();
        int length = froms.length;
        for (int i = 0; i < length/2; i++){
            char temp = froms[i];
            froms[i] = froms[length - 1 -i];
            froms[length - 1 -i] = temp;
        }
        return String.valueOf(froms);
    }

    /**
     * 循环左移index位字符串
     * 思想：先部分反转，后整体反转
     * @param from
     * @param index
     * @return
     */
    public static String leftMoveIndex(String from,int index){
        String first = from.substring(0,index);
        String second = from.substring(index);
        first = reChange(first);
        second = reChange(second);
        from = first + second;
        from = reChange(from);
        return from;
    }

    /**
     * 循环右移index位字符串
     * 思想：先整体反转，后部分反转
     * @param from
     * @param index
     * @return
     */
    public static String rightMoveIndex(String from,int index){
        from = reChange(from);
        String first = from.substring(0,index);
        String second = from.substring(index);
        first = reChange(first);
        second = reChange(second);
        from = first + second;
        return from;
    }
    //需要移动的字符串：from
    //需要移动的位数：index
    public static void main(String[] args) {
        String leftString = "zvagqag";
        System.out.println("左移3位字符串结果："+leftMoveIndex(leftString,3));
        String rightString = "abcdefg";
        System.out.println("右移3位字符串结果："+rightMoveIndex(rightString,3));

    }
}
