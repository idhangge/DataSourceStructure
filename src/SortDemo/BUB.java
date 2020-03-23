package SortDemo;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static SortDemo.BubbleTest.bubbleSort;
import static SortDemo.BubbleTest.bubbleSort1;


/**
 * 输入n个数 排序
 *
 * @return: 冒泡排序
 */
public class BUB {
    public static void main(String[] args) {

        //int[] arrays = {24, 69, 80, 57, 13};
        int[] arrays = new int[80000];
        for (int i = 0; i < 80000; i++) {
            // 会生成[0,8000000)的数
            arrays[i] = (int)(Math.random() * 8000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datestr1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是:"+datestr1);
        // 调用冒泡排序方法
        bubbleSort(arrays);
        Date date2 = new Date();
        String datestr2 = simpleDateFormat.format(date2);
        System.out.println("排序前的时间是:"+datestr2);


       /* System.out.println("排序前: " + Arrays.toString(arrays));
        //冒泡排序
        bubbleSort(arrays);
        System.out.println("排序后: " + Arrays.toString(arrays));*/

    }


}