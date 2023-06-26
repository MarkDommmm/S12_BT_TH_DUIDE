package BT_12;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        double[] arr = {1.2, 3.4, 5.6, 7.8, 9.1};
        System.out.println("Nhập một số thực cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        BinarySearch(arr, num);
        System.out.println("Số lớn nhất là " + arr[arr.length - 1]);
    }
    public static double BinarySearch(double[] arr, double value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                System.out.println("số cần tìm ở ví trí thứ" + mid);
                return mid;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
