import java.util.ArrayList;

public class AddingRemovingAndSize {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(11);

        list.add("index0");
        list.add("index1");
        list.add("index2");
        list.add("index3");
        list.add("index4");

        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");


        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(3));// index4 is OP

        System.out.println(list.size());

        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        System.out.println(list.size());  //although the output here is 6 but internal capasity is still 11
        // to save remaning memory we can use
        list.trimToSize();
        System.out.println(list.size()); // internal capasity is now 6 not 11





    }
}
