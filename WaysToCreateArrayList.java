import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaysToCreateArrayList {
    public static void main(String[] args) {
        // normal way with default capasity of 10
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("mango");
        System.out.println(list1);


        // way2 by defining capasity of list as 15
        ArrayList<String> list2 = new ArrayList<>(15);
        list2.add("apple");
        list2.add("banana");
        list2.add("mango");
        System.out.println(list2);


        //way3 creating arraylist from another collections
        List<String> list3 = Arrays.asList("apple", "banana","mango");
        //list3.add("guava"); will throws an exceptions
        System.out.println(list3);



        // way4 flaxiable way of type3

        List<String> list4= new ArrayList<>(Arrays.asList("apple","banana")); // i love this way it is more flexiable approach
        list4.add("mango");
        System.out.println(list4);


    }
}
