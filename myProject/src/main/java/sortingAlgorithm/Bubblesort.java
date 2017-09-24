package sortingAlgorithm;

/**
 * Created by kaszy on 2017-09-18 22:23.
 */
//冒泡排序
public class Bubblesort {
    public static void bubbleSort(int[] array){
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] array){
        if(array.length==0||array ==null){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] array = {1,5,2,11,27,6,4};
        System.out.println("初始数组为：");
        printArray(array);
        bubbleSort(array);
        System.out.println("\n"+"排序后数组为：");
        printArray(array);
    }
}


