package com.swipeit.game.Controller;

import com.swipeit.game.Models.GameModel;
import com.swipeit.game.States.GameState;
import com.swipeit.game.States.MultiPlayerState;
import com.swipeit.game.States.SinglePlayerState;

/**
 * Created by Lars on 10.03.2017.
 */

public class BoardController {
    private GameModel gameModel;
    private GameState gameState;
    public BoardController(Boolean isMultiPlayer){
        createGameState(isMultiPlayer);
    }

    private void createGameState(Boolean isMultiPlayer) {
        if (isMultiPlayer) gameState = new MultiPlayerState(this);
        else gameState = new SinglePlayerState(this);
    }

    public GameModel getGameModel(){
        return gameModel;
    }

    public void createGameModel(){
        new GameModel();
    }

    public void startGame(){
     //   gameModel.startGame();
    }
}
