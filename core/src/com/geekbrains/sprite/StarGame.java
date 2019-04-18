package com.geekbrains.sprite;

import com.badlogic.gdx.Game;

import com.geekbrains.screen.MenuScreen;

public class StarGame extends Game {

    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }

}
