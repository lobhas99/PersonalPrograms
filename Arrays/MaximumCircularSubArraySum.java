package Arrays;

public class MaximumCircularSubArraySum {

    public static int maximumSumSubArray(int arr[]) {
        int res = 0;
        int maxSubArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSubArraySum = Math.max(maxSubArraySum + arr[i], arr[i]);
            res = Math.max(maxSubArraySum, res);
        }
        return res;

    }

    public static void maximumCircularSubArraySum(int arr[]) {
        int maxNormal = maximumSumSubArray(arr);
        if (maxNormal<0) {
            System.out.println(maxNormal);
            return;
        }
        int arrSum=0;
        for(int i=0;i<arr.length;i++){
            arrSum+=arr[i];
            arr[i]=-arr[i];
        }
        int maxCircular=maximumSumSubArray(arr)+ arrSum;
        System.out.println(Math.max(maxNormal,maxCircular));
    }

    public static void main(String[] args) {
        int[] arr = {8,-4,3,-5,4};
        maximumCircularSubArraySum(arr);
    }
}
