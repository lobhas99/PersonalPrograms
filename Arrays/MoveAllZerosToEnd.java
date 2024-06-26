package Arrays;

public class MoveAllZerosToEnd {

    static void moveAllZerosToEnd(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 4, 5, 0, 8, 5, 05, 5, 1, 1, 1, 5, 0, 0, 8, 0, 4, 5, 1, 5, 6, 1, 2, 0, 5, 1 };
        moveAllZerosToEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}