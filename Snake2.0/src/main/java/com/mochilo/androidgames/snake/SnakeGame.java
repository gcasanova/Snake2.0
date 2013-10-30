package com.mochilo.androidgames.snake;

import com.mochilo.androidgames.framework.Screen;
import com.mochilo.androidgames.framework.impl.AndroidGame;

/**
 * Created by gcasanovarizo on 29/10/13.
 */
public class SnakeGame extends AndroidGame {
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}