package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 17:10.
 */
//斐波那契数列
public class Fibonacci {
    public static void Fibonacci(int n){
        int a=0;//第一项
        int b=1;//第二项
        int c=0;
        if(n==0){
            System.out.println(0);
        }
        if(n==1){
            System.out.println(1);
        }
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;//新的第一项
            b=c;//新的第二项
        }
        System.out.println("第"+ n +"项的值为："+c);
    }

    public static void main(String[] args) {
        System.out.println("请输入n：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci(n);
    }
}
