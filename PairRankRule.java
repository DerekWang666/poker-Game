import java.util.List;

public class PairRankRule extends RankRule{
    @Override
    boolean match(List<card> Cards) {
        if(Cards.get(0).value == Cards.get(1).value
                || Cards.get(0).value == Cards.get(2).value
                || Cards.get(1).value == Cards.get(2).value)
            return true;
        return false;
    }
}
