package com.swipeit.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.swipeit.game.Controller.BoardController;
import com.swipeit.game.Models.GameModel;

import java.util.ArrayList;

/**
 * Created by Lars on 10.03.2017.
 */

public abstract class GameState {
    protected BoardController boardController;


    //OrthographicCamera cam = new OrthographicCamera();

    public GameState(BoardController boardController){
        this.boardController=boardController;
    }


    public abstract void startGame();
}
