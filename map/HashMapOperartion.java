package map;

import java.util.HashMap;

public class HashMapOperartion {
    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>();

        map.put(101,"hari");
        map.put(102,"Radha");
        map.put(103,"shyam");
        map.put(104,"Ram");


        System.out.println("before any modification or operation on map \n "+map);

        // check if value is present or not
        System.out.println(map.containsValue("Ram")); // true // time complexity is O(1)

        // check if key is present or not
        System.out.println(map.containsKey(102));  // true




    }
}
