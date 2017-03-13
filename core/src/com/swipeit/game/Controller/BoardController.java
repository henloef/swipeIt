package com.swipeit.game.Controller;

import com.swipeit.game.Models.GameModel;
import com.swipeit.game.States.GameState;
import com.swipeit.game.States.MultiPlayerState;
import com.swipeit.game.States.SinglePlayerState;

/**
 * Created by Lars on 10.03.2017.
 */

public class BoardController {
    private GameState gameState;
    private GameModel gameModel;
    public BoardController(Boolean isMultiPlayer){
        createGameState(isMultiPlayer);
        gameModel = new GameModel();
    }

    private void createGameState(Boolean isMultiPlayer) {
        if (isMultiPlayer) gameState = new MultiPlayerState();
        else gameState = new SinglePlayerState();
    }
}
