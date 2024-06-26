package Arrays;

public class Leader {

    public static void leader(int arr[]) {
        int n = arr.length;
        int ldr = arr[n - 1];
        System.out.print(ldr + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > ldr) {
                ldr = arr[i];
                System.out.print(ldr + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 8, 5, 2, 85, 1, 56, 4, 6, 7, 2 };
        leader(arr);
    }
}
