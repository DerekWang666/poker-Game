import java.util.List;

public class FlushRankRule extends RankRule{
    @Override
    boolean match(List<card> Cards) {
        Color c = Cards.get(0).color;
        for(int i = 1; i<=2; i++){
            if(Cards.get(i).color != c)
                return false;
        }
        return true;
    }
}
