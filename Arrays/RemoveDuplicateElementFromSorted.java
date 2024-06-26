package Arrays;

public class RemoveDuplicateElementFromSorted {

    static int removeDuplicate(int arr[]) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 5 };
        removeDuplicate(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}