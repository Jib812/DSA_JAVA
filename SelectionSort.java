// package DSA_IN_JAVA;

public class SelectionSort {
    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = smallest;
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2,1,2,4,6,8};
        sorting(arr);
    
        for (int num : arr) {
            System.out.println(num);
        }
    
    }



}
