package com.geekbrains.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.geekbrains.base.Sprite;
import com.geekbrains.math.Rect;
import com.geekbrains.screen.GameScreen;

public class StarShip extends Sprite {
    private Game game;





    public StarShip(TextureAtlas atlas, Game game) {
        super(atlas.findRegion("main_ship"));
        regions[0].setRegion(regions[0].getRegionX(), regions[0].getRegionY() , regions[0].getRegionWidth()/2 , regions[0].getRegionHeight());

        this.game = game;
        setHeightProportion(0.19f);
    }

    @Override
    public void setHeightProportion(float height) {
        super.setHeightProportion(height);
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setBottom(worldBounds.getBottom() + 0.05f);
        setLeft(worldBounds.getLeft() + 0.3f);
    }

    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(
                regions[frame],
                getLeft() , getBottom(),
                halfWidth , halfHeight,
                getWidth(), getHeight(),
                scale, scale,
                angle
        );
    }
}
