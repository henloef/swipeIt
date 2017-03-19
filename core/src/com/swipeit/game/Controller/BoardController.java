package com.swipeit.game.Controller;

import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.swipeit.game.Models.Direction;
import com.swipeit.game.Models.GameModel;
import com.swipeit.game.States.GameState;
import com.swipeit.game.States.MultiPlayerState;
import com.swipeit.game.States.SinglePlayerState;

/**
 * Created by Lars on 10.03.2017.
 */

public class BoardController extends ClickListener{
    private GameModel gameModel;
    private GameState gameState;
    private boolean isMultiplayer;

    public BoardController(Boolean isMultiPlayer){
        this.isMultiplayer = isMultiPlayer;
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

    public boolean tryDirection(Direction direction){
        return gameModel.checkDirection(direction);
    }

    public void play(){
        while (gameModel.timeLeft()){
            playCard();
        }
    }
    public void playCard(){
        gameModel.nextCard();
        //tryDirection()
    }

    private Direction decideDirection(int startX,int endX,int startY,int endY){
        int deltaX = endX - startX;
        int deltaY = endY - startY;
        if(Math.abs(deltaX) > Math.abs(deltaY)){
            if(deltaX > 0){
                return Direction.RIGHT;
            }else{
                return Direction.LEFT;
            }
        }else{
            if(deltaY > 0){
                return Direction.DOWN;
            }else{
                return Direction.UP;
            }
        }
    }
}
