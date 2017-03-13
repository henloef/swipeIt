package com.swipeit.game.Models;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Lars on 10.03.2017.
 */

public class GameModel {

    public ArrayList<CardModel> cards;
    private CardModel currentCard;


    //Constructor
    public GameModel(){
        createCards();
    }

    public boolean checkDirection(Direction playerDirection){
        Direction cardDirection = currentCard.getDirection();
        if(cardDirection == playerDirection) return true;
        else return false;
    }


    //Makes card for each direction
    private void createCards(){
        //TODO Make stack from input
        cards = new ArrayList<CardModel>();
        cards.add(new CardModel(Direction.UP));
        cards.add(new CardModel(Direction.DOWN));
        cards.add(new CardModel(Direction.LEFT));
        cards.add(new CardModel(Direction.RIGHT));
    }


    private void nextCard(){
        Random r = new Random();
        currentCard = cards.get(r.nextInt(4));
    }

}
