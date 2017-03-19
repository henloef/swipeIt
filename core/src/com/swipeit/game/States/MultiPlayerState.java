package com.swipeit.game.States;

import com.swipeit.game.Controller.BoardController;
import com.swipeit.game.Controller.ServerCommunicator;
import com.swipeit.game.Models.GameModel;

import java.util.ArrayList;

/**
 * Created by group xx on 10.03.2017.
 */

public class MultiPlayerState extends GameState {

    private int gameKey;
    private ServerCommunicator serverCommunicator;

    public MultiPlayerState(BoardController boardController){
        super(boardController);
        getGameKey();
    }

    //ServerCommunactor gives an opponent
    public void setOpponentPlayer(int key, BoardController opponentBoardController){
        if( key == gameKey){
            boardControllers.add(opponentBoardController);
        }
    }

    //Have to choose between the method above and the method below

    /*Ask server for opponent
    private void getOpponentPlayer(){
        if(serverCommunicator.requestGameKey == gameKey){
            boardControllers.add(serverCommunicator.requestBoardController);
        }
    }*/

    //Ask server for gameKey
    public void getGameKey(){
        //TODO connect to server and get gameKey
        serverCommunicator.getGameKey();
    }

    public void startGame(){
        for(BoardController boardController: boardControllers){
           // boardController.startGame();
        }
    }

}
