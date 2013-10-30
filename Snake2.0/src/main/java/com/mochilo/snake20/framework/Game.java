package com.mochilo.snake20.framework;

/**
 * Created by Mochilo on 26/10/13.
 */
public interface Game {
    public Input getInput();
    public FileIO getFileIO();
    public Graphics getGraphics();
    public Audio getAudio();
    public void setScreen(Screen screen);
    public Screen getCurrentScreen();
    public Screen getStartScreen();
}
