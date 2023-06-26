package BT_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] words = str.split("a");
        String max = "";
        for (String word : words) {
            if (word.length() == max.length()) {
                max = word;
            }
        }
        System.out.println("a" + max);
    }
}
