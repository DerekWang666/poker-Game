import java.util.*;

public class StraightFlushRankRule extends RankRule{

    @Override
    boolean match(List<card> cards) {
        Collections.sort(cards,new cardComparator());
        if(cards.size() < 3)
            return false;
        int a = cards.get(0).value;
         Color c = cards.get(0).color;
        for(int i = 1; i<3; i++){
            if(cards.get(i).value != a+1 || cards.get(i).color != c)
                return false;
            a = cards.get(i).value;
        }
        return true;
    }
}
