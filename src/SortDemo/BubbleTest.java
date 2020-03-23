package SortDemo;

public class BubbleTest {

    public static void bubbleSort(int[] arr) {
        int num = 0;
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
            num++;


        }
        System.out.println("执行" + num);
    }


    public static void bubbleSort1(int[] arrays) {
        //执行趟数
        int num = 0;
        //是否置换
        int isChange;
        //外层循环是排序的趟数
        for (int i = 0; i < arrays.length - 1; i++) {
            //每比较一趟就重新初始化为0(没有置换)
            isChange = 0;

            //内层循环是当前趟数需要比较的次数
            for (int j = 0; j < arrays.length - i - 1; j++) {

                //前一位与后一位与前一位比较，如果前一位比后一位要大，那么交换
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;


                    //如果进到这里面了，说明发生置换了
                    isChange = 1;

                }
            }
            //如果比较完一趟没有发生置换，那么说明已经排好序了，不需要再执行下去了
            if (isChange == 0) {
                break;
            }
            num++;
        }
        System.out.println("执行" + num);

    }

}
