package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 16:06.
 */
public class sort4 {
    public static void sort(int[] arr){
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        if(arr.length==0||arr==null){
            return;
        }
        int sum=0;
        System.out.println("排序后的数字为：");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
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
