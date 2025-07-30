package linked_list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkListTest1 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();

        // adding elements in linked list
        list1.add("apple");
        list1.add("ball");
        list1.add("cat");
        list1.addFirst("zebra");
        list1.addLast("ant");

        LinkedList<String> list2= new LinkedList<>();
        list2.add("hero honda");
        list2.add("pulser");
        list2.add("shine");

        //using addAll() method
        list1.addAll(list2);

        //adding element at specific index
        list1.add(3,"ma three index wala hooo");



        System.out.println(list1);



        // different way to create LinkedList
        LinkedList<Integer> intList= new LinkedList<>(Arrays.asList(2,67,75,44,644,454));
        System.out.println(intList);


        // removing elements from linked list using removeAll() method
        LinkedList<Integer> integerToRemove = new LinkedList<>(Arrays.asList(67,644,454,2));
        intList.removeAll(integerToRemove);
        System.out.println(intList);

        //we can also create Linked List uisng Array interface
        List<String> list = new LinkedList<>();
        list.add("science");
        list.add("math");
        list.add("social");
        list.add("neapli");
        list.addLast("hello world");
        list.addFirst("hi wolrd");

        System.out.println(list);
    }
}