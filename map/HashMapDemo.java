package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // hash map in java
        HashMap<Integer, String> map1= new HashMap<>();


        //adding data (key-value) pair in hash map
        map1.put(101,"hari bahadur");
        map1.put(102,"krishna bahadur");
        map1.put(103,"ram bahadur");
        map1.put(104,"madahan bahadur");
        System.out.println(map1);  // {101=hari bahadur, 102=krishna bahadur, 103=ram bahadur, 104=madahan bahadur}

        //getting value of map using key
        System.out.println(map1.get(103)); //ram bahadur

        // to check if any key exists in map
        System.out.println(map1.containsKey(102)); // true
        System.out.println(map1.containsKey(220)); //false

        //to check if value exists or not
        System.out.println(map1.containsValue("hari bahadur")); //true


        //printing all values of map
        for (int i : map1.keySet()){
            System.out.println(map1.get(i));
        }

        // printing key values of map
        Set<Map.Entry<Integer, String>>entries=map1.entrySet();
        for (Map.Entry<Integer,String> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }



    }
}
