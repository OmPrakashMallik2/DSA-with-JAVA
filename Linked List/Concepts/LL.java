package Concepts;
import java.util.LinkedList;
// import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // ADD FIRST/LAST
        list.addFirst(5);
        list.addFirst(10);
        list.addLast(30);
        list.add(20);
        System.out.println(list);
        

        //SIZE
        int n = list.size();
        System.out.println(n);


        //LOOP
        for(int i=0; i<n; i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        
        //SEARCH 
        for(int i=0; i<n; i++){
            if(list.get(i)==30){
                System.out.println("On the index : "+i);
            }
        }
        System.out.println("null");
        

        // DELETE / REMOVE

        System.out.println(list);
        // list.removeLast();
        // list.removeFirst();
        list.remove(2);
        System.out.println(list);
    }
}


                      //  THANKYOU 💙 //