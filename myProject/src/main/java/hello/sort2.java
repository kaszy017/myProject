package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 00:41.
 */
public class sort2 {
    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        if(array.length==0||array==null){
            return;
        }
        System.out.println("排序后的数字为：");
        int sum =0;
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
            sum=sum+array[i];
        }
        System.out.println("\n"+"数字之和为："+sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要排序的数字：");
        String str = sc.nextLine();
        String[] strs = str.split(",");
        int[] ints = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            ints[i]=Integer.parseInt(strs[i]);
        }
        sort(ints);

    }
}
