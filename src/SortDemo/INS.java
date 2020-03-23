package SortDemo;

import java.util.Arrays;

import static SortDemo.InsertTest.Insert1;

public class INS {
    public static void main(String[] args) {
        int[] arrays = {3, 2, 5, 8, 4, 7, 6, 9};

        System.out.println("排序前: " + Arrays.toString(arrays));

        Insert1(arrays);

        System.out.println("排序后: " + Arrays.toString(arrays));
    }

    /*将一个元素插入到已有序的数组中，在初始时未知是否存在有序的数据，
    因此将元素第一个元素看成是有序的与有序的数组进行比较，比它大则直接放入，
    比它小则移动数组元素的位置，找到个合适的位置插入当只有一个数时，则不需要插入了，
    因此需要n-1趟排序，比如10个数，需要9趟排序
    // 从排序好的数组中从后往前比较            */
    private static void Insert(int[] arrays) {
        // 一个for循环内嵌一个while循环实现，外层for循环控制需要排序的趟数，
        // while循环找到合适的插入位置(并且插入的位置不能小于0)

        //临时变量
        int temp;
        int num = 0;
        //外层循环控制需要排序的趟数(从1开始因为将第0位看成了有序数据)
        for (int i = 1; i < arrays.length; i++) {

            temp = arrays[i];

            //如果前一位(已排序的数据)比当前数据要大，那么就进入循环比较[参考第二趟排序]
            while (i >= 1 && arrays[i - 1] > temp) {

                //往后退一个位置，让当前数据与之前前位进行比较
                arrays[i] = arrays[i - 1];

                //不断往前，直到退出循环
                i--;

            }

            //退出了循环说明找到了合适的位置了，将当前数据插入合适的位置中
            arrays[i] = temp;

            num++;
        }
        System.out.println("执行" + num);


    }


}


