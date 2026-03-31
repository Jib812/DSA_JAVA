public class InsertionSort {

   public static void sorting(int[] arr) {
       for (int i = 1; i < arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
           while (j == 0 && arr[j] > current) {
               arr[j + 1] = arr[j];
               j--;
           }
           //placement
           arr[j + 1] = current;
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
