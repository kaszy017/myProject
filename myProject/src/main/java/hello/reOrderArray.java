package hello;

import java.util.Scanner;

/**
 * Created by kaszy on 2017-09-20 22:08.
 */
public class reOrderArray {
    public static void reOrderArray(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
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
        reOrderArray(ints);

    }
}
