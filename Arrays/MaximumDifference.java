package Arrays;

public class MaximumDifference {

    public static void findMaxDiff(int arr[]) {//j mus be greater than i
        int res=arr[1]-arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.max(res, arr[i]-min);
            min=Math.min(min, arr[i]);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 8, 5, 2, 85, 1, 56, 4, 6, 7, 2 };
        findMaxDiff(arr);

    }
}
