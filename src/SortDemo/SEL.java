package SortDemo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @date: 2020/3/16
 * 选择排序 :
 * 从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
 */
public class SEL {

    public static void main(String[] args) {
        // int[] arrays = {24, 69, 80, 57, 13};
/*
		// 第一次
		int x = 0;
		for (int y = x + 1; y < arr.length; y++) {
			if (arr[y] < arr[x]) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}
		System.out.println("第一次比较后：");
		printArray(arr);

		// 第二次
		x = 1;
		for (int y = x + 1; y < arr.length; y++) {
			if (arr[y] < arr[x]) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}
		System.out.println("第二次比较后：");
		printArray(arr);

		// 第三次
		x = 2;
		for (int y = x + 1; y < arr.length; y++) {
			if (arr[y] < arr[x]) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}
		System.out.println("第三次比较后：");
		printArray(arr);

		// 第四次
		x = 3;
		for (int y = x + 1; y < arr.length; y++) {
			if (arr[y] < arr[x]) {
				int temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
			}
		}
		System.out.println("第四次比较后：");
		printArray(arr);
		*/

		/*
		//通过观察发现代码的重复度太高，所以用循环改进
		for(int x=0; x<arr.length-1; x++){
			for(int y=x+1; y<arr.length; y++){
				if(arr[y] <arr[x]){
					int temp = arr[x];
					arr[x] = arr[y];
					 arr[y] = temp;
				}
			}
		}
		System.out.println("排序后：");
		printArray(arr);
		*/
        int[] arrays = new int[80000];
        for (int i = 0; i < 80000; i++) {
            // 会生成[0,1000000)的数
            arrays[i] = (int) (Math.random() * 1000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datestr1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是:" + datestr1);

        // selectSort(arrays);
         selectSort2(arrays);
        Date date2 = new Date();
        String datestr2 = simpleDateFormat.format(date2);
        System.out.println("排序前的时间是:" + datestr2);

//        System.out.println("排序前: " + Arrays.toString(arrays));
//
//        selectSort(arrays);
//        System.out.println("排序后: " + Arrays.toString(arrays));


    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //选择排序的优化
    public static void selectSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i];//将数组的第一个元素也就是最小元素赋值给num
            int index = i;//将其下表赋值给index
            for (int j = i + 1; j < arr.length; j++) {
                if (num > arr[j]) {//如果最小元素大于比较的值，则将num值重新赋值，index赋值新的下标
                    num = arr[j];
                    index = j;
                }
            }
            if (index != i) {//如果index是i值，说明i下标的值是最小值，如果不是则说明不是，则交换
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

    }
}
