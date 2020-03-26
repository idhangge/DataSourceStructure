package SortDemo;

import java.util.Arrays;
//根节点比左孩子和右孩子都要大，完成一次建堆的操作实质上是比较根节点和左孩子、右孩子的大小，大的交换到根节点上，直至最大的节点在树顶
//        随后与数组最后一位元素进行交换
//        ......
public class MaxHeap {
    public static void main(String[] args) {
        int[] arrays = {3, 2, 5, 8, 4, 7, 6, 9};

        System.out.println("排序前: " + Arrays.toString(arrays));

        for (int i = 0; i < arrays.length; i++) {

            //每完成一次建堆就可以排除一个元素了
            maxHeapify(arrays, arrays.length - i);

            //交换
            int temp = arrays[0];
            arrays[0] = arrays[(arrays.length - 1) - i];
            arrays[(arrays.length - 1) - i] = temp;

        }

        System.out.println("排序后: " + Arrays.toString(arrays));
    }
//    只要左子树或右子树大于当前根节点，则替换。替换后会导致下面的子树发生了变化，因此同样需要进行比较，
//    直至各个节点实现父>子这么一个条件
    /**
     * 完成一次建堆，最大值在堆的顶部(根节点)
     */
    public static void maxHeapify(int[] arrays, int size) {

        for (int i = size - 1; i >= 0; i--) {
            heapify(arrays, i, size);
        }

    }


    /**
     * 建堆
     *
     * @param arrays          看作是完全二叉树
     * @param currentRootNode 当前父节点位置
     * @param size            节点总数
     */
    public static void heapify(int[] arrays, int currentRootNode, int size) {

        if (currentRootNode < size) {
            //左子树和右字数的位置
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;

            //把当前父节点位置看成是最大的
            int max = currentRootNode;

            if (left < size) {
                //如果比当前根元素要大，记录它的位置
                if (arrays[max] < arrays[left]) {
                    max = left;
                }
            }
            if (right < size) {
                //如果比当前根元素要大，记录它的位置
                if (arrays[max] < arrays[right]) {
                    max = right;
                }
            }
            //如果最大的不是根元素位置，那么就交换
            if (max != currentRootNode) {
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;

                //继续比较，直到完成一次建堆
                heapify(arrays, max, size);
            }
        }
    }

}
