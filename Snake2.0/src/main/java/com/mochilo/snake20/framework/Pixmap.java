package com.mochilo.snake20.framework;

/**
 * Created by Mochilo on 26/10/13.
 */

import com.mochilo.snake20.framework.Graphics.PixmapFormat;

public interface Pixmap {
    public int getWidth();
    public int getHeight();
    public PixmapFormat getFormat();
    public void dispose();
}
