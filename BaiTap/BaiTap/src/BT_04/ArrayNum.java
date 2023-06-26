package BT_04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
         boolean flag  = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
                System.out.println("Tim thấy" + i);
                break;

            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy");
        }
    }
}
