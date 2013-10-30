package com.mochilo.snake20.framework;

import android.view.View.OnTouchListener;

import com.mochilo.snake20.framework.Input.TouchEvent;

import java.util.List;

/**
 * Created by Mochilo on 28/10/13.
 */
public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);
    public int getTouchX(int pointer);
    public int getTouchY(int pointer);
    public List<TouchEvent> getTouchEvents();
}