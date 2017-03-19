package com.swipeit.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.swipeit.game.Models.CardModel;
import com.swipeit.game.Models.Direction;

public class SwipeIt extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	public static int WIDTH;
	public static int HEIGHT;
	CardModel card;

	@Override
	public void create () {
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		card = new CardModel(Direction.RIGHT);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(card.getTexture(), 500, 500); //TODO Fix turning arrow
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
