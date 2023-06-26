package BT_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = getArr();
        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                numberList.add(i);
            }
        }
        System.out.println(numberList);

    }
}
