package com.geekbrains.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.geekbrains.base.BaseScreen;
import com.geekbrains.math.Rect;
import com.geekbrains.sprite.Background;
import com.geekbrains.sprite.ButtonExit;
import com.geekbrains.sprite.ButtonPlay;
import com.geekbrains.sprite.Star;
import com.geekbrains.sprite.StarShip;

public class GameScreen extends BaseScreen {
    private Game game;

    private Texture bg;
    private Background background;
    private Star starList[];
    private TextureAtlas atlas;
    private TextureAtlas mainAtlas;

    private StarShip ship;

    public GameScreen(Game game) {
        this.game = game;
    }


    @Override
    public void show() {
        super.show();
        bg = new Texture("textures/bg.png");
        background = new Background(new TextureRegion(bg));
        atlas = new TextureAtlas("textures/menuAtlas.tpack");
        mainAtlas = new TextureAtlas("textures/mainAtlas.tpack");
        starList = new Star[256];
        for (int i = 0; i < starList.length; i++) {
            starList[i] = new Star(atlas);
        }
        ship = new StarShip(mainAtlas, game);
    }


    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        background.resize(worldBounds);
        for (Star star : starList) {
            star.resize(worldBounds);
        }
        ship.resize(worldBounds);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        update(delta);
        draw();
    }

    private void update(float delta) {
        for (Star star : starList) {
            star.update(delta);
        }
    }

    private void draw() {
        batch.begin();
        background.draw(batch);
        for (Star star : starList) {
            star.draw(batch);
        }
        ship.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        bg.dispose();
        atlas.dispose();
        mainAtlas.dispose();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer) {
       // buttonExit.touchDown(touch, pointer);

        return false;
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer) {
       // buttonExit.touchUp(touch, pointer);

        return false;
    }

}
