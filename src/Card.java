public class Card {
    private int suit;
    private int num;

    public Card(int s, int n) {
        suit = s;
        num = n;
    }
    public boolean isGreaterThan(Card newCard)
    {
        if (newCard.num > num)
            return false;
        else
            return true;
    }
    public int getIntSuit() {
        return suit;
    }
    public int getIntNum() {
        return num;
    }
    public String getStringNum() {
        switch(num) {
            case(0):
                return "Ace";
            case(1):
                return "Two";
            case(2):
                return "Three";
            case(3):
                return "Four";
            case(4):
                return "Five";
            case(5):
                return "Six";
            case(6):
                return "Seven";
            case(7):
                return "Eight";
            case(8):
                return "Nine";
            case(9):
                return "Ten";
            case(10):
                return "Jack";
            case(11):
                return "Queen";
            case(12):
                return "King";
            default:
                return "Error";
        }
    }
    public String getStringSuit() {
        switch(suit) {
            case(0):
                return "Spades";
            case(1):
                return "Clubs";
            case(2):
                return "Hearts";
            case(3):
                return "Diamonds";
            default:
                return "Error";
        }

    }
}
