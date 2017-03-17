package com.swipeit.game.Models;

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

    public CardModel(Texture texture, Direction direction){
        this.setTexture(texture);
        this.direction = direction;

    }


    //

    /*
    private int value;
    private String suit;
    */
}
