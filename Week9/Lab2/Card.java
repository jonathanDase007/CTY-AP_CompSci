public class Card{
    private String suit;
    private String type;

    public Card(String suit, String type){
        this.suit = suit;
        this.type = type;
    }

    public String getSuit() { return suit;}
    public String getType() { return type;}
}