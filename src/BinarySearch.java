public class BinarySearch {

    public static void main(String[] args) {
        // Array should be sorted
        int[] arr = new int[]{1, 2, 5, 14, 19, 22, 33, 45, 58, 65};
        int element = 111;
        int index = binarySearch(arr, arr.length, element);
        System.out.println("Element " + element + " found at index " + index);
    }

    private static int binarySearch(final int[] arr, final int size, final int element) {
        int low, mid, high;
        low = 0;
        high = size - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] < element) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


}
