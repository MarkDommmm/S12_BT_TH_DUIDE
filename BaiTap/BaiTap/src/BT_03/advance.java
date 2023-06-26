package BT_03;

import java.util.Arrays;
import java.util.Scanner;

public class advance {
    private static int[][] getArr() {
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }
    private static boolean checked(int[][] arr, int num) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if (arr[i][j] == num) {
                    check = true;
                    break;
                }
            }
        }
        if (!check) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[][] arr = getArr();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Arrays.deepToString(arr));
        System.out.println(checked(arr, num));

    }
}
