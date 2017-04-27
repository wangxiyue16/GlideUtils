package com.glideutils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.glideutils.GlideProvoider.GlideProvider;
import com.glideutils.transform.BaseTransform;


/**
 * description: 网络图片专用ImageView，如果使用该类直接在XML中用该类代替imageview即可
 * author: WDSG
 * date: 2017/3/31
 */
//TODO 注意：这个类只提供了Glide加载网络图片url的方法，如果想使用Glide加载本地图片或者文件等，请使用BaseGlideLoadImageUtil工具类
@SuppressLint("AppCompatCustomView")
public class GlideNetworkImageView extends ImageView {
    private GlideProvider mGlideProvider;

    public GlideNetworkImageView(Context context) {
        super(context);
        init();
    }

    public GlideNetworkImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public GlideNetworkImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mGlideProvider = new GlideProvider(this);
    }

    //---------- 最基本方式 ------------//
    //普通加载图片
    public void load(String url) {
        mGlideProvider.load(getContext(), url, 0);
    }

    //普通加载图片, 缩略图
    public void load(String url, float breviary) {
        mGlideProvider.load(getContext(), url, 0, 0, null, false, breviary);
    }

    //普通加载图片, 圆角，缩略图
    public void load(String url, BaseTransform baseTransform, float breviary) {
        mGlideProvider.load(getContext(), url, 0, 0, baseTransform, false, breviary);
    }

    //带圆角，圆形
    public void load(String url, BaseTransform baseTransform) {
        mGlideProvider.load(getContext(), url, 0, 0, baseTransform, false, 1.0f);
    }

    //---------- Context, Activity, FragmentActivity ------------//
    //普通加载图片
    public void load(Context context, String url) {
        mGlideProvider.load(context, url, 0);
    }

    //普通加载图片, 缩略图
    public void load(Context context, String url, float breviary) {
        mGlideProvider.load(context, url, 0, 0, null, false, breviary);
    }

    //普通加载图片, 圆角，缩略图
    public void load(Context context, String url, BaseTransform baseTransform, float breviary) {
        mGlideProvider.load(context, url, 0, 0, baseTransform, false, breviary);
    }

    //带圆角，圆形
    public void load(Context context, String url, BaseTransform baseTransform) {
        mGlideProvider.load(context, url, 0, 0, baseTransform, false, 1.0f);
    }

    //带占位图
    public void load(Context context, String url, @DrawableRes int placeHolderRid) {
        mGlideProvider.load(context, url, placeHolderRid, 0);
    }

    //占位图，加载错误图
    public void load(Context context, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        mGlideProvider.load(context, url, placeHolderRid, errorRid, null);
    }

    //占位图， 圆角和圆形
    public void load(Context context, String url, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        mGlideProvider.load(context, url, placeHolderRid, 0, baseTransform);
    }

    //占位图，加载错误图，圆角和圆形
    public void load(Context context, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        mGlideProvider.load(context, url, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    //占位图，加载错误图，圆角和圆形,缩略图比例
    public void load(Context context, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        mGlideProvider.load(context, url, placeHolderRid, errorRid, baseTransform, false, breviary);
    }

    //---------- android.app.Fragment ------------//
    public void load(android.app.Fragment fragment, String url) {
        mGlideProvider.load(fragment, url, 0);
    }

    public void load(android.app.Fragment fragment, String url, float breviary) {
        mGlideProvider.load(fragment, url, 0, 0, null, false, breviary);
    }

    public void load(android.app.Fragment fragment, String url, BaseTransform baseTransform, float breviary) {
        mGlideProvider.load(fragment, url, 0, 0, baseTransform, false, breviary);
    }

    public void load(android.app.Fragment fragment, String url, BaseTransform baseTransform) {
        mGlideProvider.load(fragment, url, 0, 0, baseTransform, false, 1.0f);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid) {
        mGlideProvider.load(fragment, url, placeHolderRid, 0);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        mGlideProvider.load(fragment, url, placeHolderRid, errorRid, null);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        mGlideProvider.load(fragment, url, placeHolderRid, 0, baseTransform);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        mGlideProvider.load(fragment, url, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        mGlideProvider.load(fragment, url, placeHolderRid, errorRid, baseTransform, false, breviary);
    }

    //---------- Fragment ------------//
    public void load(Fragment fragment, String url) {
        mGlideProvider.load(fragment, url, 0);
    }

    public void load(Fragment fragment, String url, float breviary) {
        mGlideProvider.load(fragment, url, 0, 0, null, false, breviary);
    }

    public void load(Fragment fragment, String url, BaseTransform baseTransform, float breviary) {
        mGlideProvider.load(fragment, url, 0, 0, baseTransform, false, breviary);
    }

    public void load(Fragment fragment, String url, BaseTransform baseTransform) {
        mGlideProvider.load(fragment, url, 0, 0, baseTransform, false, 1.0f);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid) {
        mGlideProvider.load(fragment, url, placeHolderRid, 0);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        mGlideProvider.load(fragment, url, placeHolderRid, errorRid, null);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        mGlideProvider.load(fragment, url, placeHolderRid, 0, baseTransform, 1.0f);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        mGlideProvider.load(fragment, url, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        mGlideProvider.load(fragment, url, placeHolderRid, errorRid, baseTransform, false, breviary);
    }
}
