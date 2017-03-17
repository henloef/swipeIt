package com.swipeit.game.Models;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;
import java.util.Random;

import static com.badlogic.gdx.Input.Keys.R;

/**
 * Created by Lars on 10.03.2017.
 */

public class GameModel {

    private ArrayList<CardModel> cards;
    private CardModel currentCard;
    private ArrayList<PlayerModel> players;

    //Constructor
    public GameModel(){
        createCards();
        players = new ArrayList<PlayerModel>();
        PlayerModel player = new PlayerModel();

    }

    public void createPlayers(int amount){
        for(int i = 0; i < amount; i++){
            players.add(new PlayerModel());
        }
    }
    //Makes card for each direction
    private void createCards(){
        cards = new ArrayList<CardModel>();
        for(Direction dir : Direction.values()){
            cards.add(new CardModel(dir));
        }
    }

    //compares direction from user with card-direction. if same, return true and go to next card
    public boolean checkDirection(Direction playerDirection){
        Direction cardDirection = currentCard.getDirection();
        if(cardDirection == playerDirection){
            nextCard();
            return true;
        }
        else return false;
    }

    //sets current card to a new, random card
    private void nextCard(){
        Random r = new Random();
        currentCard = cards.get(r.nextInt(Direction.values().length));
    }
    public ArrayList<PlayerModel> getPlayers() {
        return players;
    }
}
