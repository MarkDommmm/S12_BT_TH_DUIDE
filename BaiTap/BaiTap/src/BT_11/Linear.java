package BT_11;

import java.util.Scanner;

public class Linear {
    public static int LinearSearch(double[] arr, double value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static double findMax(double[] arr ) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] arr = {1.2, 2.3, 3.4, 5.6, 7.8};

        System.out.println("Nhập số cần tìm: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        int index = LinearSearch(arr, num);

        if (index != -1) {
            System.out.println("Tìm thấy giá trị " + num + " tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy giá trị " + num + " trong mảng");
        }

        double max = findMax(arr);
        System.out.println("Số lớn nhất trong mảng: " + max);

    }
}
