package com.swipeit.game.Models;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Lars on 10.03.2017.
 */

public class CardModel extends Sprite{
    private Direction direction;

    public Direction getDirection() {
        return direction;
    }

    public CardModel(Direction direction){
        Texture pil = new Texture("pil.gif");
        setTexture(pil);
        this.direction = direction;

    }


    //

    /*
    private int value;
    private String suit;
    */
}
