package TH_01;

    public class BinarySearch {
        static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        public static int binarySearch(int arr[], int value) {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == value) {
                    return mid;
                } else if (arr[mid] < value) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            System.out.println(binarySearch(list, 2));  /* 0 */
            System.out.println(binarySearch(list, 11)); /* 4 */
            System.out.println(binarySearch(list, 79)); /*12 */
            System.out.println(binarySearch(list, 1));  /*-1 */
            System.out.println(binarySearch(list, 5));  /*-1 */
            System.out.println(binarySearch(list, 80)); /*-1 */

        }
    }

