package Arrays;

public class TrappingRainWater {

    public static void maxTrapWater(int arr[]) {
        int n = arr.length;
        int res = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }
        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }
        for (int i = 1; i < n; i++) {
            res = res + Math.min(lmax[i], rmax[i]) - arr[i];
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        int[] arr = { 5, 0, 6, 2, 3 };
        maxTrapWater(arr);
    }
}
