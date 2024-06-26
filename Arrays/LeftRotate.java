package Arrays;

public class LeftRotate {

    public static void leftRotate(int nums[], int k) {
        int n = nums.length;
        reverse(nums, 0, k - 1);// reversing the 1st part of array
        reverse(nums, k, n - 1);// reversing the second part of array
        reverse(nums, 0, n - 1);// reversing the whole array
    }

    public static void reverse(int nums[], int i, int j) {
        while (i < j) {// reversing the array
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 8, 5, 2, 85, 1, 56, 4, 6, 7, 2 };
        int n = 2;
        leftRotate(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}