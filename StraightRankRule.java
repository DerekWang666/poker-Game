import java.util.Collections;
import java.util.List;

public class StraightRankRule extends RankRule{
    @Override
    boolean match(List<card> Cards) {
        Collections.sort(Cards, new cardComparator());
        if(Cards.size() < 3)
            return false;
        int a = Cards.get(0).value;
        for(int i = 1; i<3; i++){
            if(Cards.get(i).value != a+1)
                return false;
            a = Cards.get(i).value;
        }
        return true;
    }
}
