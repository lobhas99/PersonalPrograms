package Arrays;

public class MaximumSumSubArray {

    public static void maximumSumSubArray(int arr[]) {
        int res = 0;
        int maxSubArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSubArraySum = Math.max(maxSubArraySum + arr[i], arr[i]);
            res = Math.max(maxSubArraySum, res);
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
        maximumSumSubArray(arr);
    }
}
