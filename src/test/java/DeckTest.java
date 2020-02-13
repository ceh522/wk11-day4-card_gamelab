import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck ();
    }

    @Test
    public void checkDeckHas52Cards(){
        assertEquals(52, deck.getCardArrayLength());
        assertEquals(true, deck.dealFirstCard() instanceof Card);
    }

    @Test
    public void afterCardHasBeenDealtDeckHasOneLessCard(){
        deck.dealFirstCard();
        assertEquals(51, deck.getCardArrayLength());
    }

}
