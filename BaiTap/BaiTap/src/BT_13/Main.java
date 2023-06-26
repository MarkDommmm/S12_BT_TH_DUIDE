package BT_13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ: ");
        String str = scanner.nextLine();

        List<String> lines = new ArrayList<>(Arrays.asList(str.replaceAll("\\n", "").split("")));
        Set<String> set = new TreeSet<>(lines);


        System.out.println(set);
    }
}
