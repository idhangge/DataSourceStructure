package SortDemo;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


/**
 * 输入n个数 排序
 *
 * @return: 冒泡排序
 */
public class BUB {
    public static void main(String[] args) {
       /* int[] arrays = new int[80000];
        for (int i = 0; i < 80000; i++) {
            // 会生成[0,1000000)的数
            arrays[i] = (int)(Math.random() * 1000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datestr1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是:"+datestr1);
        // 调用冒泡排序方法
        bubbleSort(arrays);
        Date date2 = new Date();
        String datestr2 = simpleDateFormat.format(date2);
        System.out.println("排序前的时间是:"+datestr2);*/
/*
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));

        bubbleSort(arr);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));*/

        int[] arrays = {3,2,1};

        System.out.println("排序前: " + Arrays.toString(arrays));
        //冒泡排序
        bubbleSort(arrays);
        System.out.println("排序后: " + Arrays.toString(arrays));

    }

    public static void bubbleSort(int[] arr) {
        // 每一趟排序，就是将最大的排序在最后
        int temp = 0; //临时变量
        boolean flag = false; // 标识变量，表示是否进行过交换
        for (int i = 0; i < arr.length - 1; i++) { // 外循环，一共循环数组长度-1次
            for (int j = 0; j < arr.length - 1 - i; j++) { // 内循环，每次只需要排序沉底元素之前的元素
                // 如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) { // 在一趟排序中，一次交换都没有发生过
                break;
            } else {
                flag = false; // 重置flag，进行下次判断
            }
        }
    }


/*   1. //第一位和第二位比 (3和2比)
           if (arrays[0] > arrays[1]) {
        //交换  [2,3,1]
        temp = arrays[0];
        arrays[0] = arrays[1];
        arrays[1] = temp;
    }

  2.  //第二位和第三位比 (3和1比)
          if (arrays[1] > arrays[2]) {
        //交换  [2,1,3]
        temp = arrays[1];
        arrays[1] = arrays[2];
        arrays[2] = temp;
    }*/


}