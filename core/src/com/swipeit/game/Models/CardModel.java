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
