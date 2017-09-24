package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 00:03.
 */
public class sum3 {
    public static void sum(int a,int b){
        int sum = 0;
        for(int i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println("结果为：" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a:");
        String str1 = sc.nextLine();
        System.out.println("请输入b:");
        String str2 = sc.nextLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        sum(a,b);

    }
}
