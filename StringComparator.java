import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) { // we assume that o1 > o2 therfore this gives positive/ascending sorting
        return o1.length()-o2.length();
    }
}
