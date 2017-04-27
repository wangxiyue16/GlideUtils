package com.glideutils.transform;

import android.content.Context;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * description: 图片渲染
 * author: WDSG
 * date: 2017/3/24
 */
abstract public class BaseTransform extends BitmapTransformation {
    public BaseTransform(Context context) {
        super(context);
    }

    public BaseTransform(BitmapPool bitmapPool) {
        super(bitmapPool);
    }
}
