

import java.util.Arrays;
import java.util.Random;

public class Sort{
    public static void insertSort(int[] arr){
        //空间复杂度：
        //时间复杂度：
        //是否具有稳定性：
        //循环插入的次数
        for (int i = 0; i < arr.length - 1; i++){
//            有序区间是[0,i]
//            无序区间是[i,length)
            int key = arr[i + 1];
            int j;
            for (j = i;j >= 0;j--){
                if (key < arr[j]){
                    arr[j + 1] = arr[j];
                }else {
                    break;
                }

            }
            arr[j + 1] = key;

        }

    }
    public static void shellSort(int[] arr){
        int gap = arr.length / 2;
        while(true){
            gapSort(arr,gap);
            if (gap == 1){
               break;
            }
            gap = gap / 2;
        }

    }

    private static void gapSort(int[] arr,int gap) {
        for (int i = 0; i < arr.length;i++){
            int key = arr[i];
            int j;
            for (j = i-gap;j >= 0; j = j - gap){
                if (arr[j] > key){
                    arr[j + gap] = arr [j];
                }else
                {break;}
            }
            arr[j + gap] = key;
        }
    }

    public static void selectSort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            //无序区间 ：[0,arr.length - i)
            //有序区间 ：[arr,length - i , arr.length)
            int maxIndex = 0;
            for(int j = 1;j < arr.length - i;j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }

            swap(arr, maxIndex,arr.length - i -1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr [i] = arr[j];
        arr [j] = t;
    }

    public static int[] RadomNum(){
        Random random = new Random(20201020);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] a = RadomNum();
        System.out.println(Arrays.toString(a));
        selectSort(a);
        System.out.println(Arrays.toString(a));



    }
}