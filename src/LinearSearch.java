public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 4, 9, 2, 33, 5, 98, 45};
        int element = 33;
        int index = linearSearch(arr, arr.length, element);
        System.out.println("Element " + element + " found at index "+ index);
    }

    private static int linearSearch(final int[] arr, final int size, final int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }


}
