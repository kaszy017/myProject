package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 18:00.
 */
public class JumpFloorII {
    public static int JumpFloorII(int target){
        if(target <= 0){
            return 0;
        }else if(target == 1){
            return 1;
        }else{
            return 2*JumpFloorII(target-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。");
        System.out.println("请输入n:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        //输出return返回的值
        System.out.println("当n="+ target +"时，共有"+JumpFloorII(target)+"种跳法");

    }
}
