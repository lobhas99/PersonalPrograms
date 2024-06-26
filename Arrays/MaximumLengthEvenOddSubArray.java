package Arrays;

public class MaximumLengthEvenOddSubArray {

    public static void maximumLengthEvenOddSubArray(int arr[]) {
        int res = 1;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            } else
                curr = 1;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 14, 7, 8 };
        maximumLengthEvenOddSubArray(arr);
    }
}
