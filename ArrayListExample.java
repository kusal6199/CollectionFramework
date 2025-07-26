import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // creating a array list

        ArrayList<String> list = new ArrayList<>(); // default capasity =10, size now is 0

        //adding elements into the list
        list.add("kushal kandel ");// index = 0
        list.add("orchid college"); // index=1
        list.add("be happy and smile");// index=2

        System.out.println(list.get(2)); // 2 is index

        //try accessing element from list whose index does not exist
        try {
            System.out.println(list.get(5));
            // IndexOutOfBoundsException will be thrown hence it need to be handles by try catch
        } catch (IndexOutOfBoundsException e){
            System.out.println("try to access element of index that doesnot exists the size of arraylist is "+ list.size());
            e.printStackTrace();
        }

    }
}
