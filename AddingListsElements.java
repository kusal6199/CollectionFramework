import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingListsElements {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("apple");
        list.add("banana");

        // adding at perticular index

        list.add(0,"mango");

        System.out.println(list);

        List<String> list1= List.of("hey", "hello","listen","you");
        System.out.println(list1);


        ArrayList<String> list3 = new ArrayList<>(list1);
        list3.add("mister");
        list3.add("excuse me");
        System.out.println(list3);


        List<String> list4= new ArrayList<>(Arrays.asList("please","hiii","byee","hello there"));

        list4.add("my name is kusal ");
        list4.add(3,"address is baglung");

        // replacing list elements

        System.out.println(list4);

        list4.set(0,"no please");
        // after replcing 0th index
        System.out.println(list4);

        // removing element by indes
        list4.remove(2);
        System.out.println(list4);

        // replacing list by value
        list4.remove("hiii");
        System.out.println(list4);








    }
}
