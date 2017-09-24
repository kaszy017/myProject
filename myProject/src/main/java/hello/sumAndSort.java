package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-19 23:09.
 */
//从键盘获取a和b，从a加到b
public class sumAndSort {
    public static void sum(int a,int b){
        int sum=0;
        for(int i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println("结果为：" + sum);
    }

    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        if(array.length==0||array==null){
            return;
        }
        System.out.println("排序后的顺序为：");
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
            sum=sum+array[i];
        }

        System.out.println("\n" + "数字之和为：" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            同时录入两个值
            System.out.println("请输入值：a,b");
            String str = sc.nextLine();//录入字符串
            String[] temp = str.split(",");//使用正则表达式进行分割
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            sumAndSort(a,b);
        */
        //求和
        System.out.println("请输入值a：");
        String str1 = sc.nextLine();
        System.out.println("请输入值b：");
        String str2 = sc.nextLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        sum(a,b);
        //排序并求和
        System.out.println("请输入需要排序的数字：");
        //将输入的字符串赋值给str
        String str = sc.nextLine();
        //将字符串str用逗号分隔，并分隔后的元素赋值给string数组
        String[] temp = str.split(",");
        //定义int数组
        int[] ls = new int[temp.length];
        //遍历String数组，赋值给int数组
        for(int i=0;i<temp.length;i++){
            ls[i]=Integer.parseInt(temp[i]);
        }
        sort(ls);

    }
}
