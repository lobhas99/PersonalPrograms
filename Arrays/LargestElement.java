package Arrays;

public class LargestElement {

    static int getLargestElement(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[res])
                res = i;
        }
        return res;
    }

    static int getSecondLargestElement(int arr[]) {
        int res = -1, largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }

    static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
    static void reverseArray(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("Largest element is at index " + getLargestElement(arr));
        System.out.println("Second Largest element is at index " + getSecondLargestElement(arr));
        System.out.println("Is array sorted? " + isSorted(arr));
        reverseArray(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }

}