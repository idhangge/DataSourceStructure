package SortDemo;

import java.util.Arrays;

public class ShellSort {
//    希尔排序实质上就是插入排序的增强版，希尔排序将数组分隔成n组来进行插入排序，
//    直至该数组宏观上有序，最后再进行插入排序时就不用移动那么多次位置了～
    public static void main(String[] args) {
        int[] arrays = {3, 2, 5, 8, 4, 7, 6, 9};

        System.out.println("排序前: " + Arrays.toString(arrays));

        shellSort(arrays);

        System.out.println("排序后: " + Arrays.toString(arrays));
    }


    /**
     * 希尔排序
     *希尔增量一般是gap = gap / 2，只是比普通版插入排序多了这么一个for循环
     * @param arrays
     */
    public static void shellSort(int[] arrays) {


        //增量每次都/2
        for (int step = arrays.length / 2; step > 0; step /= 2) {

            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {

                int j = i;
                int temp = arrays[j];

                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arrays[j - step] > temp) {
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
            }
        }


    }
}
