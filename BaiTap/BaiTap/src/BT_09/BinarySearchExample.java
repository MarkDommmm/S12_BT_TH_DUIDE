package BT_09;

import java.util.*;

public class BinarySearchExample {
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();

        int lowerIndex = findLowerBound(arr, min);
        int upperIndex = findUpperBound(arr, max);

        int count = upperIndex - lowerIndex + 1;

        System.out.println("Số lượng số tìm thấy: " + count);
        System.out.println("Chi tiết các số trong khoảng [" + min + ", " + max + "]:");
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int findLowerBound(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lowerBound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] >= target) {
                lowerBound = mid;
                right = mid - 1;
            }
        }

        return lowerBound;
    }

    private static int findUpperBound(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int upperBound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] <= target) {
                upperBound = mid;
                left = mid + 1;
            }
        }

        return upperBound;
    }
}
