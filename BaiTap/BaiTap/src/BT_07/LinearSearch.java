package BT_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String strList = scanner.nextLine();
        String[] words = strList.split(" ");


        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        String str = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                System.out.println("Chuỗi được tìm thấy tại vị trí: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy chuỗi trong danh sách.");
        }
    }
}
