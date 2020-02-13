import sun.tools.tree.NewInstanceExpression;

public enum Type {
    ACE(false),
    TWO(false),
    THREE(false),
    FOUR(false),
    FIVE(false),
    SIX(false),
    SEVEN(false),
    EIGHT(false),
    NINE(false),
    TEN(false),
    JACK(true),
    QUEEN(true),
    KING(true);

    private final boolean isFaceCard;

    Type(boolean isFaceCard){
        this.isFaceCard =isFaceCard;
    }

    public boolean getIsFaceCard(){
        return this.isFaceCard;
    }

}
