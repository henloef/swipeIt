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
        try {
            this.pil = new Texture("pil.gif");
            setTexture(pil);
        }catch(NullPointerException e){
            System.out.println("Error creating texture");
        }
        this.direction = direction;

    }
    private void setTexture(){

    }



    //

    /*
    private int value;
    private String suit;
    */
}
