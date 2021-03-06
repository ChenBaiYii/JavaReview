package cn.f.f;

import java.util.Arrays;

public class BinarySearchTest {
    public static void main(String[] args) {
        System.out.println("二分查找:");

        int[] arr = {30, 20, 50, 10, 80, 9, 7, 12, 100, 40, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(customBinarySearch(arr, 20));
    }


    public static int customBinarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (value == arr[mid]) {
                return mid;
            }
            if (value > arr[mid]) {
                low = mid + 1;
            }
            if (value < arr[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
