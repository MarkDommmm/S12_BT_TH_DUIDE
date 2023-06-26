package BT_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }

    public static int BinarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;

            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
          int num = scanner.nextInt();
        System.out.println(BinarySearch(arr, num));


    }
}
