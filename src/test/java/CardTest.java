import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

        Card card;

    @Before
    public void before(){
        card = new Card(Suit.SPADES, Type.ACE);
    }

    @Test
    public void checkCardHasSuit(){
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public void checkCardHasType(){
        assertEquals(Type.ACE, card.getType());
    }

    @Test
    public void checkIfCardIsFaceCard(){
        assertEquals(false, card.isFaceCard());
    }

}
