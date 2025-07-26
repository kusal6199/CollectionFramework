import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) { // we assume that o1 > o2 therfore this gives negative sorting
        return o2-o1;
    }
}
