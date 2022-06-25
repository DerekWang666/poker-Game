import java.util.List;

public class ThreeOfAKindRankRule extends RankRule{
    @Override
    boolean match(List<card> Cards) {
        if(Cards.size() < 3)
            return false;
        int a = Cards.get(0).value;
        for(int i = 1; i<=2; i++){
            if(a != Cards.get(i).value)
                return false;
        }
        return true;
    }
}
