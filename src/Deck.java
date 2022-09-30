import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck() {
        int counter = 0;
        for (int suit = 0; suit < 4; suit++)
        {
            for (int num = 0; num < 13; num++)
            {
                cards.add(new Card(suit, num));
                counter++;
            }
        }
    }
    public Card drawCard() {
        return cards.get((int)(Math.random() * 52));
    }
}
