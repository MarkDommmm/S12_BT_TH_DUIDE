package BT_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static Integer BinarySearch(Integer[] arr, Integer value) {

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();


        System.out.println(BinarySearch(arr, num));

    }

}
