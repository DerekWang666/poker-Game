import java.util.Comparator;

class RankComparator implements Comparator<Rank> {

    @Override
    public int compare(Rank r1, Rank r2) {
        return Integer.compare(r1.priority,r2.priority);
    }
}
