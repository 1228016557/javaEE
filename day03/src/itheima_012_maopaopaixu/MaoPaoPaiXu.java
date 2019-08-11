package itheima_012_maopaopaixu;
import java.util.Arrays;
/*
      冒泡排序实现方法
 */
public class MaoPaoPaiXu<arr> {
    public static void main(String[] args) {

        //创建一个数组
        int[] arr = {10, 56, 85, 4, 2, 44, 95, 63, 22};
        System.out.println("排序前：" + Arrays.toString(arr));
        //for循环来实现
        for (int x = 0; x < arr.length - 1; x++) {
            //第一次判断需要arr.length-1次，第二次需要arr.lenght-2次......以此类推
            for (int i = 0; i < arr.length - 1 - x; i++) {
                //相邻的两个进行比较并且判断操作
                if (arr[i] > arr[i + 1]) {
                    //如果前面的大于后面的则互换位置
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(arr));

    }
}
