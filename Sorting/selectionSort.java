public class selectionSort {

    // SELECTION SORT -> Decreasing order
    static void dsSort(int a[]){
        for(int i=0; i<a.length; i++){
            int mx = i;
            for(int j=i+1; j<a.length; j++){
                if(a[mx] < a[j]){
                    mx = j;
                }
            }
            //swap
            int temp = a[mx];
            a[mx] = a[i];
            a[i] = temp;
        }
    }

    // SELECTION SORT -> Increasing order
    static void sSort(int a[]){
        for(int i=0; i<a.length; i++){
            int min_index = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[min_index]){
                    min_index = j;
                }
            }

            //swap
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }
    }

    // Prints the array
    static void printArray(int arr[]) {
        int n = arr.length;
        System.out.print("[ ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 1, 3, 9, 5 };
        sSort(arr);
        printArray(arr);
        dsSort(arr);
        printArray(arr);
    }
}