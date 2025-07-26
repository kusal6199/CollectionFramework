import java.util.*;

public class SortingArrayList {

    public static void main(String[] args) {



        ArrayList<String> list1 = new ArrayList<>();
        list1.add("ok"); //length =2
        list1.add("hello"); // length = 5
        list1.add("bye"); // length= 3

        // sorting on the basis of length of string
        StringComparator ob = new StringComparator();
        Collections.sort(list1,ob);

        System.out.println(list1);

        // sorting for Integer array

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(200);
        list2.add(50);
        list2.add(30);
        list2.add(900);
        list2.add(20);

        IntegerComparator comparator = new IntegerComparator();
        Collections.sort(list2,comparator);

        System.out.println(list2);


        // shortcut method for ascending sorting without any jhan jhat
        List<String> list3= new ArrayList<>(Arrays.asList("banana", "ok","bye","seeee you"));
        list3.add("hello world from ktm");

        list3.sort((a,b)->a.length()-b.length()); // this method assume that if a-b > 0 then ascending and if b-a <0 then descending
        System.out.println(list3);

        // for descending
        list3.sort((a,b)->b.length()-a.length());
        System.out.println(list3);





    }
}
