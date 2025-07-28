import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
      List<String> lis1 = new ArrayList<>(Arrays.asList("Raman","Prasant","Hitesh","Rajan"));
      lis1.add("pankajh");
      lis1.add("chiran");

      lis1.sort((o1, o2) -> o1.length()-o2.length());
        System.out.println(lis1);



    }
}
