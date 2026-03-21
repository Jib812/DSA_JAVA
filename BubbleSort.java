// package DSA_IN_JAVA;

public class BubbleSort {
    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 2, 9 };
        sorting(arr);
        for (int num : arr) {
            System.out.println(num);
        
    }
}
}