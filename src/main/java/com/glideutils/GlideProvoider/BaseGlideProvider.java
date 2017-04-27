package com.glideutils.GlideProvoider;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.glideutils.transform.BaseTransform;


/**
 * description: 提供Glide加载网络url的加载方式
 * author: WDSG
 * date: 2017/3/31
 */
public class BaseGlideProvider {
    private ImageView mIv;

    public BaseGlideProvider(ImageView iv) {
        mIv = iv;
    }

    protected ImageView getIv() {
        return mIv;
    }

    //---------- Context ------------//

    /**
     * @param context
     * @param url            图片url
     * @param placeHolderRid 占位图
     * @param errorRid       加载错误图
     * @param baseTransform  暂时只有圆角或者圆形
     * @param isCacheAll     是否让Glide既缓存全尺寸又缓存其他尺寸
     * @param breviary       缩略图比例，按照比例降低图片像素大小(只降低像素，不改变图片物理大小)
     */
    public final void load(Context context, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(context).load(url);
        if (placeHolderRid != 0) {
            /**
             * 使用.placeholder()方法在某些情况下会导致图片显示的时候出现图片变形的情况。
             * 这是因为Glide默认开启的crossFade动画导致的TransitionDrawable绘制异常，
             * 详细描述和讨论可以看一下这个#363 issue。根本原因就是你的placeholder图片和你要加载显示的图片宽高比不一样，
             * 而Android的TransitionDrawable无法很好地处理不同宽高比的过渡问题，这的确是个Bug，是Android的也是Glide的。
             * 解决办法：使用.dontAnimate()方法禁用过渡动画，或者使用animate()方法自己写动画，再或者自己修复TransitionDrawable的问题。
             */
            //FIXME 这里先暂时这样写，这是glide的bug，网上推荐解决方案，还没有发现更好的办法
            drawTypeRequest
                    .placeholder(placeHolderRid) //加载占位图
                    .dontAnimate(); //禁用过渡动画
        }

        if (errorRid != 0) {
            drawTypeRequest.error(errorRid); //加载网络错误图片
        }

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform); //暂时这里是加载圆形或者圆角图片
        }

        if (isCacheAll) {
            /**
             * DiskCacheStrategy.NONE 跳过磁盘缓存,不会缓存图片到磁盘中
             * DiskCacheStrategy.SOURCE 仅仅只缓存图片真实分辨率(即网络请求的是多大分辨率的就缓存多大的)
             * DiskCacheStrategy.RESULT 仅仅缓存最终的图像，即降低分辨率后的（或者是转换后的）
             * DiskCacheStrategy.ALL 缓存所有版本的图像（默认行为）
             */
            drawTypeRequest.diskCacheStrategy(DiskCacheStrategy.ALL); //让Glide既缓存全尺寸又缓存其他尺寸
        }

        if (breviary != 0) {
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(mIv);
    }

    //---------- Activity ------------//
    public final void load(Activity activity, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(url);
        if (placeHolderRid != 0) {
            drawTypeRequest
                    .placeholder(placeHolderRid)
                    .dontAnimate(); //禁用过渡动画;
        }

        if (errorRid != 0) {
            drawTypeRequest.error(errorRid);
        }

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (isCacheAll) {
            drawTypeRequest.diskCacheStrategy(DiskCacheStrategy.ALL);
        }

        if (breviary != 0) {
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(mIv);
    }

    //---------- FragmentActivity ------------//
    public final void load(FragmentActivity activity, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(url);
        if (placeHolderRid != 0) {
            drawTypeRequest
                    .placeholder(placeHolderRid)
                    .dontAnimate(); //禁用过渡动画;
        }

        if (errorRid != 0) {
            drawTypeRequest.error(errorRid);
        }

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (isCacheAll) {
            drawTypeRequest.diskCacheStrategy(DiskCacheStrategy.ALL);
        }

        if (breviary != 0) {
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(mIv);
    }

    //---------- android.app.Fragment ------------//
    public final void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(url);
        if (placeHolderRid != 0) {
            drawTypeRequest
                    .placeholder(placeHolderRid) //加载占位图
                    .dontAnimate(); //禁用过渡动画
        }

        if (errorRid != 0) {
            drawTypeRequest.error(errorRid);
        }

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (isCacheAll) {
            drawTypeRequest.diskCacheStrategy(DiskCacheStrategy.ALL);
        }

        if (breviary != 0) {
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(mIv);
    }

    //---------- Fragment ------------//
    public final void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(url);
        if (placeHolderRid != 0) {
            drawTypeRequest
                    .placeholder(placeHolderRid)
                    .dontAnimate(); //禁用过渡动画;
        }

        if (errorRid != 0) {
            drawTypeRequest.error(errorRid);
        }

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (isCacheAll) {
            drawTypeRequest.diskCacheStrategy(DiskCacheStrategy.ALL);
        }

        if (breviary != 0) {
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(mIv);
    }
}
