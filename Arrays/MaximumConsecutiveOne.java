package Arrays;

public class MaximumConsecutiveOne {

    public static void maximumConsecutiveOneInArray(int arr[]) {
        int res = 0;
        int currCount = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                currCount = 0;
            else {
                currCount++;
                res = Math.max(res, currCount);
            }
        }
        System.out.println("Maximum Consecutive One's in the array is: " + res);

    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 11, 1, 1, 10, 1, 0, 1, 0, 1, 0 };
        maximumConsecutiveOneInArray(arr);
    }
}
