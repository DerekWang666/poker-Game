import java.util.Comparator;

public class cardComparator implements Comparator<card> {
    @Override
    public int compare(card c1, card c2) {
        return Integer.compare(c1.value,c2.value);
    }
}
