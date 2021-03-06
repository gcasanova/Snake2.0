package com.mochilo.androidgames.framework.impl;

import android.graphics.Bitmap;

import com.mochilo.androidgames.framework.Graphics.PixmapFormat;
import com.mochilo.androidgames.framework.Pixmap;

/**
 * Created by Mochilo on 29/10/13.
 */
public class AndroidPixmap implements Pixmap {
    Bitmap bitmap;
    PixmapFormat format;
    public AndroidPixmap(Bitmap bitmap, PixmapFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }
    public int getWidth() {
        return bitmap.getWidth();
    }
    public int getHeight() {
        return bitmap.getHeight();
    }
    public PixmapFormat getFormat() {
        return format;
    }
    public void dispose() {
        bitmap.recycle();
    }
}
