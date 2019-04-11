package com.geekbrains.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.geekbrains.MyGdxGame;
import com.geekbrains.StarGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		System.setProperty("user.name","\\xD0\\x9A\\xD1\\x80\\xD1\\x8B\\xD0\\xBC");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new StarGame(), config);
	}
}
