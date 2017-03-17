package com.swipeit.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
/**
 * Created by Lars on 10.03.2017.
 */

public abstract class GameState {
    private Texture background;

    public GameState(){
        background = new Texture("bg.png");
    }
    //TODO Implement logic
}
