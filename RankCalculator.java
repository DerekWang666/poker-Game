import java.util.*;

public class RankCalculator {
    List<card> Cards;
    private static Map<Rank,RankRule> map = new HashMap<>();
    public RankCalculator(List<card> Cards){
        this.Cards = Cards;
        map.put(Rank.StraightFlush, new StraightFlushRankRule());
        map.put(Rank.ThreeOfAKind, new ThreeOfAKindRankRule());
        map.put(Rank.Straight, new StraightRankRule());
        map.put(Rank.Flush, new FlushRankRule());
        map.put(Rank.Pair, new PairRankRule());
    }
    public static Rank calculateRank(List<card> cards){
        TreeSet<Rank> rankSet = new TreeSet<>(new RankComparator());
        rankSet.addAll(map.keySet());
        for(Rank r : rankSet){
            if(map.get(r).match(cards))
                return r;
        }
        return Rank.HighCard;
    }
}
