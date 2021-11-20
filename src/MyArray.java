public class MyArray {

    final static int CAPACITY = 100;
    static int size = 0;
    static int[] arr = new int[CAPACITY];

    public static void main(String[] args) {

        insert(0, 78, arr);
        insert(1, 4, arr);
        insert(2, 67, arr);
        insert(3, 33, arr);
        insert(2, 55, arr);
        display();

    }

    private static void insert(int index, final int value, final int[] arr) {
        if(size > CAPACITY) {
            System.out.println("Not enough space");
        }
        if(index < 0) {
            System.out.println("Index should be greater than or equal to 0");
        }
        if(size<index) {
            System.out.println("moving element to prior as we have lot of space before");
            index = size;
        }
        for(int i = size-1; i>=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    private static void display(){
        System.out.println("Array has "+size+" elements");
        for(int i =0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
