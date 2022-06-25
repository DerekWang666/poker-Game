import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class pokerGame {
    public static void main(String[] args) throws IOException {
        pokerGame pg = new pokerGame();
        List<card> cards = pg.createCards();
        Collections.shuffle(cards);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
        String playerNum = reader.readLine();

        int playerCount = Integer.parseInt(playerNum);
        if(playerCount > 10) {
            System.out.println("Too Many People!");
            return;
        }
        List<player> playerList = pg.createPlayers(playerCount, cards);
        Collections.sort(playerList, new playerComparator());
        
        String winner = playerList.get(0).id;
        System.out.printf("The Winner is %s", winner);
    }
    public List<player> createPlayers(int num, List<card> cards){
        List<player> players = new ArrayList<>();
        int i = 0;
        while(num > 0){
            List<card> c = new ArrayList<>();
            int j = i;
            for(;i<j+3;i++){
                c.add(cards.get(i));
            }
            player p = new player(c,String.valueOf(num));
            players.add(p);
            num--;
        }
        return players;
    }
    public List<card> createCards(){
        List<card> cards = new ArrayList<>();
        for(int i = 0; i<=9; i++){
            cards.add(new card(i,Color.Blue));
            cards.add(new card(i, Color.Green));
            cards.add(new card(i,Color.Red));
        }
        return cards;
    }
}
