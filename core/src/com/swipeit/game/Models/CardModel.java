package com.swipeit.game.Models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Lars on 10.03.2017.
 */

public class CardModel extends Sprite{
    private Direction direction;
    private Texture pil;

    public Texture getTexture() {
        return pil;
    }

    public Direction getDirection() {
        return direction;
    }

    public CardModel(Direction direction){
        this.pil = new Texture("pil.gif");
        setTexture(pil);
        this.direction = direction;
        scaleDirection(direction);

    }

    // Scales the texture according to the direction
    private void scaleDirection(Direction direction){
        if(direction == Direction.LEFT){
            this.setScale(-1, 1);
        }else if (direction == Direction.DOWN){
            this.rotate90(true);
        }else if (direction == Direction.UP){
            this.rotate90(false);
        }

    }



    //

    /*
    private int value;
    private String suit;
    */
}
