package sortingAlgorithm;

/**
 * Created by kaszy on 2017-09-18 22:55.
 */
//冒泡排序
public class BubbleSort02 {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
                for (int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
        }
    }

    public static void printArray(int[] arr){
        if(arr.length == 0||arr == null){
            return;
        }else {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1241,111,45,2,222,23,9};
        System.out.println("初始数组为：");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("\n"+"排序后数组为：");
        printArray(arr);
    }
}
