public class bubbleSort {
    public static void main(String args[]) {
        int arr[] = { 8, 4, 8, 2, 1, 3 };
        // int n = arr.length;
        bSort(arr);
        printArray(arr);
        dbSort(arr);
        printArray(arr);
    }

    static void dbSort(int a[]) {
        int x = a.length;
        for(int i=0; i<x-1; i++){
            for(int j=0; j<x-i-1; j++){
                if(a[j] < a[j+1]){
                    //swap
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }
    

    static void bSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print an array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}