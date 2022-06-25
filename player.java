import java.util.List;

class player {
    List<card> cards;
    Rank rank;
    String id;
    int highestCardValue = 0;
    player(List<card> cards, String id){
        this.cards = cards;
        this.id = id;
        this.rank = RankCalculator.calculateRank(cards);
        for(card c : cards){
            highestCardValue = Math.max(highestCardValue,c.value);
        }
    }
}
