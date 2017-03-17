import com.swipeit.game.Models.CardModel;
import com.swipeit.game.Models.Direction;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Henrik on 17.03.2017.
 */

public class CardModelTest {


    @Test
    public void cardDirectionValidator_CorrectDirection(){
        CardModel cardModelUp = new CardModel(Direction.UP);
        Assert.assertEquals(cardModelUp.getDirection(), Direction.UP);
        CardModel cardModelDown = new CardModel(Direction.DOWN);
        Assert.assertEquals(cardModelDown.getDirection(), Direction.DOWN);
        CardModel cardModelLeft = new CardModel(Direction.LEFT);
        Assert.assertEquals(cardModelLeft.getDirection(), Direction.LEFT);
        CardModel cardModelRight = new CardModel(Direction.RIGHT);
        Assert.assertEquals(cardModelRight.getDirection(), Direction.RIGHT);
    }

}
