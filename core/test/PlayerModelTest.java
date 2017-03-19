import com.swipeit.game.Models.PlayerModel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Henrik on 19.03.2017.
 */

public class PlayerModelTest {

    PlayerModel playerModel = new PlayerModel();

    @Test
    public void playerModelTimeValidator_timeTick(){
        Assert.assertEquals(playerModel.getCurrentTime(), 95);
        playerModel.timeTick();
        Assert.assertEquals(playerModel.getCurrentTime(), 94);
            }

    @Test
    public void playerModelTimeValidator_addTimeDoesNotExceedMaxTime(){
        playerModel.addTime(105);
        Assert.assertEquals(playerModel.getCurrentTime(), 100);
    }

    @Test
    public void playerModelTimeValidator_setCurrentTimeDoesNotExceedMaxTime(){
        playerModel.setCurrentTime(1005);
        Assert.assertEquals(playerModel.getCurrentTime(), playerModel.getMaxTime());
    }
}
