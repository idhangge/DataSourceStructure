package SortDemo;

public class SelectTest {



    //找到数组中最大的元素，与数组最后一位元素交换
    //当只有一个数时，则不需要选择了，因此需要n-1趟排序，比如10个数，需要9趟排序
    public static void selectSort1(int[] arrays) {
        //两个for循环，外层循环控制排序的趟数，内层循环找到当前趟数的最大值，
        // 随后与当前趟数组最后的一位元素交换
        int temp = 0;
        int pos;
        int num = 0;
//外层循环控制需要排序的趟数
        for (int i = 0; i < arrays.length - 1; i++) {

            //新的趟数、将角标重新赋值为0
            pos = 0;

            //内层循环控制遍历数组的个数并得到最大数的角标
            for (int j = 0; j < arrays.length - i; j++) {

                if (arrays[j] > arrays[pos]) {
                    pos = j;
                }

            }
            //交换
            temp = arrays[pos];
            arrays[pos] = arrays[arrays.length - 1 - i];
            arrays[arrays.length - 1 - i] = temp;

            num++;
        }
        System.out.println(num);

    }

    private static void selectSort(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                num++;
            }
            System.out.println(num);
        }
    }

}
