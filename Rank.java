public enum Rank {
    StraightFlush(1),
    ThreeOfAKind(2),
    Straight(3),
    Flush(4),
    Pair(5),
    HighCard(6);
    public final int priority;
    Rank(int priority){
        this.priority = priority;
    }
}
