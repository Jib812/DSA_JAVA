public class quicksort {
    
public static int  partition(int[] arr, int low , int high ) {
    int piv = arr[high];
    int i = low - 1;
    
    for (int j = low; j < high; j++) {
        if (arr[j] < piv) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
    i++;
    int temp = arr[i];
    arr[i] = piv;
    arr[high] = temp;
    return i;
}

    public static void quick(int[] arr, int low, int high) {
        
        if (low < high) {
            int pividx = partition(arr, low, high);
            quick(arr, low, pividx-1);
            quick(arr, pividx+1, high);
        }
        
    }


    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 3, 1 };
        int n = arr.length;
        quick(arr, 0, n - 1);

        for (int num : arr) {
            System.err.println(num + " ");
        }
    }


}
