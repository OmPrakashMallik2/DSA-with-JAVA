import java.util.*;

class prob1 {
    public static void main(String[] args){
        int[] arr = {5,3,4,5,4,4,5};

        highFreElmnts(arr);
    }


    // to find nums which apears more than n/3 times.
    static void highFreElmnts(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> mymap = new HashMap<>();

        for(int i=0; i<n; i++){
            if(mymap.containsKey(arr[i])){
               mymap.put(arr[i], mymap.get(arr[i])+1);
            }else{
                mymap.put(arr[i], 1);
            }
        }

        for(int key : mymap.keySet()){
            if(mymap.get(key) > n/3){
                System.out.print(key+" ");
            }
        }
    }
}