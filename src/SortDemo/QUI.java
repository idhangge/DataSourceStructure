package SortDemo;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class QUI {
    public static void main(String[] args) {

        int[] a = {3, 2, 5, 8, 4, 7, 6, 9};
       /* int[] a = new int[80000];
        for (int i = 0; i < 80000; i++) {
            // 会生成[0,1000000)的数
            a[i] = (int) (Math.random() * 1000000);
        }
        LocalTime datestr1 = LocalTime.now();
        System.out.println("排序前的时间是:" + datestr1);*/
        quickSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
//        LocalTime datestr2 = LocalTime.now();
//        System.out.println("排序后的时间是:" + datestr2);

    }


    private static void quickSort(int[] a, int l, int r) {
       //如果
        if (l >= r) {
            return;
        }
        int p = partition(a, l, r);
        quickSort(a, l, p - 1);
        quickSort(a, p + 1, r);


    }
    //沿着轴心点 分割
    private static int partition(int[] a, int l, int r) {
        // swap(a, l, (int) Math.random() % (r - l + 1) + l);
        int temp = a[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (a[i] < temp) {
                swap(a, ++j, i);
            }
        }
        swap(a, l, j);
        return j;


    }

    //交换
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}