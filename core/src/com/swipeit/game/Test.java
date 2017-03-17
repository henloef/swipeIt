package com.swipeit.game;

import com.swipeit.game.Controller.BoardController;
import com.swipeit.game.Models.CardModel;
import com.swipeit.game.Models.Direction;
import com.swipeit.game.Models.GameModel;
import com.swipeit.game.States.GameState;

/**
 * Created by Lars on 17.03.2017.
 */

public class Test {
    public static void main(String args[]){
        CardModel card = new CardModel(Direction.RIGHT);
        System.out.println(card.getDirection());

    }
}
