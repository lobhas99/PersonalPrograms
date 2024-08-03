package Arrays;

public class BuyAndSellStock {

    public static void maxProfit(int arr[]) {
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                maxProfit += arr[i] - arr[i - 1];
            }
        }
        System.out.println("The Maximum Profit is " + maxProfit);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 5, 3, 8, 12 };
        maxProfit(arr);
    }
}
