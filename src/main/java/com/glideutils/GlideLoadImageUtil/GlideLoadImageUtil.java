package com.glideutils.GlideLoadImageUtil;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import com.glideutils.transform.BaseTransform;

/**
 * description: Glide加载网络图片的工具类，如果不想在XML中使用GlideNetworkImageView，直接用该工具类调用即可
 * author: WDSG
 * date: 2017/3/24
 */
public class GlideLoadImageUtil extends BaseGlideLoadImageUtil{
    //---------- Context, Activity, FragmentActivity ------------//
    //普通加载图片
    public static void load(Context context, String url, ImageView iv) {
        load(context, url, iv, 0);
    }

    //普通加载图片, 缩略图
    public static void load(Context context, String url, ImageView iv, float breviary) {
        load(context, url, iv, 0, 0, null, false, breviary);
    }

    //普通加载图片, 圆角，缩略图
    public static void load(Context context, String url, ImageView iv, BaseTransform baseTransform, float breviary) {
        load(context, url, iv, 0, 0, baseTransform, false, breviary);
    }

    //带圆角，圆形
    public static void load(Context context, String url, ImageView iv, BaseTransform baseTransform) {
        load(context, url, iv, 0, 0, baseTransform, false, 1.0f);
    }

    //带占位图
    public static void load(Context context, String url, ImageView iv, @DrawableRes int placeHolderRid) {
        load(context, url, iv, placeHolderRid, 0);
    }

    //占位图，加载错误图
    public static void load(Context context, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        load(context, url, iv, placeHolderRid, errorRid, null);
    }

    //占位图， 圆角和圆形
    public static void load(Context context, String url, ImageView iv, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        load(context, url, iv, placeHolderRid, 0, baseTransform);
    }

    //占位图，加载错误图，圆角和圆形
    public static void load(Context context, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        load(context, url, iv, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    //占位图，加载错误图，圆角和圆形,缩略图比例
    public static void load(Context context, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        load(context, url, iv, placeHolderRid, errorRid, baseTransform, false, breviary);
    }

    //---------- android.app.Fragment ------------//
    public static void load(android.app.Fragment fragment, String url, ImageView iv) {
        load(fragment, url, iv, 0);
    }

    public static void load(android.app.Fragment fragment, String url, ImageView iv, float breviary) {
        load(fragment, url, iv, 0, 0, null, false, breviary);
    }

    public static void load(android.app.Fragment fragment, String url, ImageView iv, BaseTransform baseTransform, float breviary) {
        load(fragment, url, iv, 0, 0, baseTransform, false, breviary);
    }

    public static void load(android.app.Fragment fragment, String url, ImageView iv, BaseTransform baseTransform) {
        load(fragment, url, iv, 0, 0, baseTransform, false, 1.0f);
    }

    public static void load(android.app.Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid) {
        load(fragment, url, iv, placeHolderRid, 0);
    }

    public static void load(android.app.Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        load(fragment, url, iv, placeHolderRid, errorRid, null);
    }

    public static void load(android.app.Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        load(fragment, url, iv, placeHolderRid, 0, baseTransform);
    }

    public static void load(android.app.Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        load(fragment, url, iv, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    public static void load(android.app.Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        load(fragment, url, iv, placeHolderRid, errorRid, baseTransform, false, breviary);
    }

    //---------- Fragment ------------//
    public static void load(Fragment fragment, String url, ImageView iv) {
        load(fragment, url, iv, 0);
    }

    public static void load(Fragment fragment, String url, ImageView iv, float breviary) {
        load(fragment, url, iv, 0, 0, null, false, breviary);
    }

    public static void load(Fragment fragment, String url, ImageView iv, BaseTransform baseTransform, float breviary) {
        load(fragment, url, iv, 0, 0, baseTransform, false, breviary);
    }

    public static void load(Fragment fragment, String url, ImageView iv, BaseTransform baseTransform) {
        load(fragment, url, iv, 0, 0, baseTransform, false, 1.0f);
    }

    public static void load(Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid) {
        load(fragment, url, iv, placeHolderRid, 0);
    }

    public static void load(Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        load(fragment, url, iv, placeHolderRid, errorRid, null);
    }

    public static void load(Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        load(fragment, url, iv, placeHolderRid, 0, baseTransform, 1.0f);
    }

    public static void load(Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        load(fragment, url, iv, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    public static void load(Fragment fragment, String url, ImageView iv, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        load(fragment, url, iv, placeHolderRid, errorRid, baseTransform, false, breviary);
    }
}
