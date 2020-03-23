package SortDemo;

public class QuickTest {


    /*在数组中找一个元素(节点)，比它小的放在节点的左边，比它大的放在节点右边。
    一趟下来，比节点小的在左边，比节点大的在右边。不断执行这个操作....*/
    public static void quickSort1(int[] arrays, int L, int R) {
//        支点取中间，使用L和R表示数组的最小和最大位置
//        不断进行比较，直到找到比支点小(大)的数，随后交换，不断减小范围～
//        递归L到支点前一个元素(j)(执行相同的操作,同上)
//        递归支点后一个元素(i)到R元素(执行相同的操作,同上)
        int i = L;
        int j = R;
    //支点
        int pivot = arrays[(L + R) / 2];
        //左右两端进行扫描，只要两端还没有交替，就一直扫描
        while(i<j){
            //寻找直到比支点大的数
            while (pivot>arrays[i]) {
                i++;
            }
            //寻找直到比支点小的数
            while (pivot<arrays[j]) {
                j--;
            }
            //此时已经分别找到了比支点小的数(右边)、比支点大的数(左边)，它们进行交换
            if (i <= j) {
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
                i++;
                j--;
            }
        }

        //上面一个while保证了第一趟排序支点的左边比支点小，支点的右边比支点大了。

        //“左边”再做排序，直到左边剩下一个数(递归出口)
        if(L<j) {
            quickSort1(arrays,L,j);
        }
        //“右边”再做排序，直到右边剩下一个数(递归出口)
        if(R>i) {
            quickSort1(arrays,i,R);
        }
    }
}
