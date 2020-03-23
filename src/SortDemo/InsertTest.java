package SortDemo;

import javax.sound.midi.Soundbank;

public class InsertTest {

    public static void Insert1(int[] arrays) {
        //一个for循环内嵌一个while循环实现，外层for循环控制需要排序的趟数，
        // while循环找到合适的插入位置(并且插入的位置不能小于0)
        int temp = 0;
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
        System.out.println(num);

    }
}
