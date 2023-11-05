import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // INSERT - put();
        map.put("Sachin", 18);
        map.put("Om Prakash", 22);
        map.put("Jpm", 20);

        System.out.println(map);

        map.put("OmPrakash", 23);
        System.out.println(map);

        // SEARCH .contains();
        if (map.containsValue(22)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(map.get("OmPrakash"));
        System.out.println(map.get("OmPrakashMallik"));

        // ITERATION only through ForEach loop
        // Map.Entry<Integer,Integer>e : Map.entrySet()
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}