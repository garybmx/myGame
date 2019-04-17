package com.geekbrains.sprite;


import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.geekbrains.base.LogoSprite;
import com.geekbrains.base.Sprite;
import com.geekbrains.math.Rect;

public class BadLogic extends LogoSprite {

    public BadLogic(TextureRegion region, float scale) {
        super(region, scale);
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(worldBounds.getHeight());
        pos.set(worldBounds.pos);
    }
}
