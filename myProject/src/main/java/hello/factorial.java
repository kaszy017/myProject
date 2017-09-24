package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 22:52.
 */
//阶乘
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要进行阶乘的数字：");
        int a = sc.nextInt();
        long result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println("结果为："+result);
    }
}
