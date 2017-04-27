package com.glideutils.GlideLoadImageUtil;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.glideutils.transform.BaseTransform;

import java.io.File;
import java.net.URL;

/**
 * description: 注，其实Activity和FragmentActivity不用单写，因为它们都继承自Context。这里加上只是提示开发者可以使用这些类。
 * author: WDSG
 * date: 2017/3/27
 */
public class BaseGlideLoadImageUtil {

    //---------- Context ------------//

    /**
     * @param context
     * @param url            图片url
     * @param iv             要加载到的View
     * @param placeHolderRid 占位图
     * @param errorRid       加载错误图
     * @param baseTransform
     * @param isCacheAll     是否让Glide既缓存全尺寸又缓存其他尺寸
     * @param breviary       缩略图比例，按照比例降低图片像素大小(只降低像素，不改变图片物理大小)
     */
    protected final static void load(Context context, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
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
            drawTypeRequest.error(errorRid);
        }

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (isCacheAll) {
            drawTypeRequest.diskCacheStrategy(DiskCacheStrategy.ALL);
        }

        if (breviary != 0){
            System.out.println("------"+breviary);
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Context context, Uri uri, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(context).load(uri);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Context context, File file, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(context).load(file);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Context context, Integer resourceld, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(context).load(resourceld);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Context context, URL url, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(context).load(url);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    //---------- Activity ------------//
    protected final static void load(Activity activity, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
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

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Activity activity, Uri uri, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(uri);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Activity activity, File file, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(file);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Activity activity, Integer resourceld, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(resourceld);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Activity activity, URL url, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(url);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    //---------- FragmentActivity ------------//
    protected final static void load(FragmentActivity activity, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
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

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(iv);
    }

    public final void load(FragmentActivity activity, Uri uri, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(uri);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(FragmentActivity activity, File file, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(file);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(FragmentActivity activity, Integer resourceld, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(resourceld);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(FragmentActivity activity, URL url, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(activity).load(url);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    //---------- android.app.Fragment ------------//
    protected final static void load(android.app.Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
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

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(iv);
    }

    public final void load(android.app.Fragment fragment, Uri uri, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(uri);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(android.app.Fragment fragment, File file, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(file);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(android.app.Fragment fragment, Integer resourceld, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(resourceld);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(android.app.Fragment fragment, URL url, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(url);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    //---------- Fragment ------------//
    protected final static void load(Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, boolean isCacheAll, float breviary) {
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

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary);
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Fragment fragment, Uri uri, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(uri);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Fragment fragment, File file, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(file);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Fragment fragment, Integer resourceld, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(resourceld);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }

    public final void load(Fragment fragment, URL url, ImageView iv, BaseTransform baseTransform, float breviary) {
        DrawableTypeRequest drawTypeRequest = Glide.with(fragment).load(url);

        if (baseTransform != null) {
            drawTypeRequest.transform(baseTransform);
        }

        if (breviary != 0){
            drawTypeRequest.thumbnail(breviary); // 图片缩放
        }

        drawTypeRequest.into(iv);
    }
}
