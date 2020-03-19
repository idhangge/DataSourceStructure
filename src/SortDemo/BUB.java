package SortDemo;


import java.util.Arrays;



/**
 * 输入n个数 排序
 * @return: 冒泡排序
 */
public class BUB {
    public static void main(String[] args) {

        int[] arrays = {24,69,80,57,13};;

        		/*
		// 第一次比较 
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 0是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 0; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第一次比较后：");
		printArray(arr);

		// 第二次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 1是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 1; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第二次比较后：");
		printArray(arr);

		// 第三次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 2是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 2; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第三次比较后：");
		printArray(arr);

		// 第四次比较
		// arr.length - 1是为了防止数据越界
		// arr.length - 1 - 3是为了减少比较的次数
		for (int x = 0; x < arr.length - 1 - 3; x++) {
			if (arr[x] > arr[x + 1]) {
				int temp = arr[x];
				arr[x] = arr[x + 1];
				arr[x + 1] = temp;
			}
		}
		System.out.println("第四次比较后：");
		printArray(arr);
		*/

        // 而上面的代码重复度太高了，所以用循环改进
        // for (int y = 0; y < 4; y++) {
        // for (int x = 0; x < arr.length - 1 - y; x++) {
        // if (arr[x] > arr[x + 1]) {
        // int temp = arr[x];
        // arr[x] = arr[x + 1];
        // arr[x + 1] = temp;
        // }
        // }
        // }

		/*
		// 由于我们知道比较的次数是数组长度-1次，所以改进最终版程序
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
		System.out.println("排序后：");
		printArray(arr);
		*/



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




}