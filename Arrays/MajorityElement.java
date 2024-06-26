package Arrays;

public class MajorityElement {

    public static void findmajority(int arr[]) {
        int res = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res] == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[res])
                count++;
        }
        if (count > arr.length / 2) {
            System.out.println("Majority Element is " + arr[res]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 4, 8, 8 };
        findmajority(arr);
    }
}
