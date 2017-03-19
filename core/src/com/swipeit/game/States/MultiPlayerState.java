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
    private ArrayList<GameModel> gameModels;
    private ServerCommunicator serverCommunicator;

    public MultiPlayerState(BoardController boardController){
        super(boardController);
        gameModels = new ArrayList<GameModel>();
        getGameKey();
    }

    //ServerCommunactor gives an opponent
    public void setOpponentPlayer(int key, GameModel opponentGameModel){
        if( key == gameKey){
            gameModels.add(opponentGameModel);
        }
    }

    //Have to choose between the method above and the method below

    /*Ask server for opponent
    private void getOpponentPlayer(){
        if(serverCommunicator.requestGameKey == gameKey){
            gameModels.add(serverCommunicator.requestGameModel);
        }
    }*/

    //Ask server for gameKey
    public void getGameKey(){
        //TODO connect to server and get gameKey
        serverCommunicator.getGameKey();
    }

    public void startGame(){
        for(GameModel gameModel: gameModels){
           // gameModel.startGame();
        }
    }

    //gets gameModel from BoardController
    @Override
    public void setGameModel() {
        setGameModel(boardController.getGameModel());
    }

    private void setGameModel(GameModel gameModel){
        gameModels.add(gameModel);
    }
}
