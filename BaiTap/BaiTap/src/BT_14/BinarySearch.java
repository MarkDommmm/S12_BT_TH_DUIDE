package BT_14;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        int value = 16;

        int index = binarySearch(array, 0, array.length - 1, value);

        if (index == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + index + ".");
        }

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            }

            if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }
        }

        return -1;
    }
}

