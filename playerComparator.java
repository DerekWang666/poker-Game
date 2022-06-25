import java.util.Comparator;

public class playerComparator implements Comparator<player> {
    @Override
    public int compare(player p1, player p2){
        if(p1.rank == p2.rank){
            return p2.highestCardValue - p1.highestCardValue;
        }
        else return p1.rank.priority - p2.rank.priority;
    }
}
