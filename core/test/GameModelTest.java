import com.swipeit.game.Models.CardModel;
import com.swipeit.game.Models.Direction;
import com.swipeit.game.Models.GameModel;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Henrik on 19.03.2017.
 */

public class GameModelTest {
    GameModel gameModel = new GameModel();
    ArrayList<CardModel> cardArray = new ArrayList<CardModel>();
    CardModel cardModelLeft = new CardModel(Direction.LEFT);
    CardModel cardModelRight = new CardModel(Direction.RIGHT);
    CardModel cardModelUp = new CardModel(Direction.UP);
    CardModel cardModelDown = new CardModel(Direction.DOWN);




    @Test
    public void gameModelValidator_cardsCreated(){

        cardArray.add(cardModelLeft);
        cardArray.add(cardModelRight);
        cardArray.add(cardModelUp);
        cardArray.add(cardModelDown);
        Assert.assertEquals(gameModel.getCards().get(0).getDirection(), cardArray.get(0).getDirection());
        Assert.assertEquals(gameModel.getCards().get(1).getDirection(), cardArray.get(1).getDirection());
        Assert.assertEquals(gameModel.getCards().get(2).getDirection(), cardArray.get(2).getDirection());
        Assert.assertEquals(gameModel.getCards().get(3).getDirection(), cardArray.get(3).getDirection());

    }

}
