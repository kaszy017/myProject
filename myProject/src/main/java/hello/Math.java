package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 20:00.
 */
//求a的b次方
public class Math {
    public static double Power(double base,int exponent){
        double result = 1;
        for(int i=0;i<java.lang.Math.abs(exponent);i++){
            result*=base;
        }
        if(exponent<0){
            result=1/result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("请输入底数和指数：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(",");
        double base = Integer.parseInt(strs[0]);
        int exponent = Integer.parseInt(strs[1]);
        System.out.println(base+"的"+exponent+"次方结果为:"+Power(base,exponent));
    }

}
