public class Card {

    private Suit suit;
    private Type type;

    public Card(Suit suit, Type type){
        this.suit = suit;
        this.type = type;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public Type getType(){
        return this.type;
    }

    public boolean isFaceCard() {
        return this.type.getIsFaceCard();
    }
}
