package com.geekbrains.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import com.geekbrains.base.BaseScreen;
import com.geekbrains.math.Rect;
import com.geekbrains.sprite.BadLogic;

public class MenuScreen extends BaseScreen {


    private Vector2 pos;
    private Vector2 v;
    private  Vector2 buff;
    BadLogic bl;
    private Texture img;

    @Override
    public void show() {
        super.show();
        pos = new Vector2();
        v = new Vector2(0.2f,0.5f);
        buff = new Vector2();
        img = new Texture("badlogic.jpg");
        bl = new BadLogic(new TextureRegion(img), 0.5f);

    }
    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        bl.resize(worldBounds);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        buff.set(touch);
        System.out.println("Rect x " + touch.x + "y " + touch);
        if(buff.sub(pos).len() > v.len()){
            pos.add(v);
        }else{
            pos.set(touch);
        }
        batch.begin();
        bl.setPosition(pos);
        bl.draw(batch);
        batch.end();

    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
    }



}
