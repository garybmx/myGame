package com.geekbrains.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.geekbrains.StarGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		System.setProperty("user.name","\\xD0\\x9A\\xD1\\x80\\xD1\\x8B\\xD0\\xBC");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		float aspect = 3f/4f;
//		float aspect = 9f/16f;
		config.width = 400;
		config.height = (int) (config.width / aspect);
		config.resizable = false;
		new LwjglApplication(new StarGame(), config);
	}
}
