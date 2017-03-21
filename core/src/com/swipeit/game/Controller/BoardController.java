package com.swipeit.game.Controller;

import com.badlogic.gdx.math.Vector2;
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
    private boolean isMultiPlayer;

    public BoardController(){

    }

    private void createGameState(Boolean isMultiPlayer, Boolean generateKey) {
        if (isMultiPlayer){ gameState = new MultiPlayerState(this, generateKey);
            this.isMultiPlayer = isMultiPlayer;
        // Få fra input om man venter på motstander eller generer gamekey
        }
        else{ gameState = new SinglePlayerState(this);}
    }

    public GameModel getGameModel(){
        return gameModel;
    }

    public void createGameModel(){
        new GameModel();
    }

    public int getInputGameKey(){
        //Get input from screen
        return 0;
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

    private Direction decideDirection(Vector2 start, Vector2 end){
        float deltaX = end.x - start.x;
        float deltaY = end.y - start.y;
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
