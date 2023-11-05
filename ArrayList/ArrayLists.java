import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String arg[]){
        ArrayList<Integer> list  = new ArrayList<>(); 

        // ADD
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        System.out.println(list);


        //GET
        int res = list.get(1);
        System.out.println(res);


        // ADD ELENMT IN B/w
        list.add(0,5);
        System.out.println(list);


        // SET

        list.set(0, 10);
        System.out.println(list);

        //REMOVE/DELETE
        list.remove(0);
        System.err.println(list);


        //SIZE
        int size = list.size();
        System.out.println(size);

        //LOOP 

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();// This is for next line


        //SORTING
         Collections.sort(list); 
         System.out.println(list);

         //
        
    }
}
