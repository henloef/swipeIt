package com.swipeit.game.States;

import com.swipeit.game.Controller.BoardController;
import com.swipeit.game.Models.GameModel;

/**
 * Created by Lars on 10.03.2017.
 */

public class SinglePlayerState extends GameState {

    private GameModel gameModel;


    public SinglePlayerState(BoardController boardController){
        super(boardController);
        startGame();
    }

    //Gets gamemodel from boardController
    public void setGameModel(){
        this.gameModel = boardController.getGameModel();
    }

    @Override
    public void startGame() {
     //   gameModel.startGame();
    }


}
