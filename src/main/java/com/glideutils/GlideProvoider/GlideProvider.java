package lib.self.network.image.glide.GlideProvoider;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v4.app.Fragment;
import android.widget.ImageView;

import lib.self.network.image.glide.transform.BaseTransform;

/**
 * description:
 * author: WDSG
 * date: 2017/3/31
 */
public class GlideProvider extends BaseGlideProvider {

    public GlideProvider(ImageView iv) {
        super(iv);
    }

    //---------- Context, Activity, FragmentActivity ------------//
    //普通加载图片
    public void load(Context context, String url) {
        load(context, url, 0);
    }

    //普通加载图片, 缩略图
    public void load(Context context, String url, float breviary) {
        load(context, url, 0, 0, null, false, breviary);
    }

    //普通加载图片, 圆角，缩略图
    public void load(Context context, String url, BaseTransform baseTransform, float breviary) {
        load(context, url, 0, 0, baseTransform, false, breviary);
    }

    //带圆角，圆形
    public void load(Context context, String url, BaseTransform baseTransform) {
        load(context, url, 0, 0, baseTransform, false, 1.0f);
    }

    //带占位图
    public void load(Context context, String url, @DrawableRes int placeHolderRid) {
        load(context, url, placeHolderRid, 0);
    }

    //占位图，加载错误图
    public void load(Context context, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        load(context, url, placeHolderRid, errorRid, null);
    }

    //占位图， 圆角和圆形
    public void load(Context context, String url, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        load(context, url, placeHolderRid, 0, baseTransform);
    }

    //占位图，加载错误图，圆角和圆形
    public void load(Context context, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        load(context, url, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    //占位图，加载错误图，圆角和圆形,缩略图比例
    public void load(Context context, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        load(context, url, placeHolderRid, errorRid, baseTransform, false, breviary);
    }

    //---------- android.app.Fragment ------------//
    public void load(android.app.Fragment fragment, String url) {
        load(fragment, url, 0);
    }

    public void load(android.app.Fragment fragment, String url, float breviary) {
        load(fragment, url, 0, 0, null, false, breviary);
    }

    public void load(android.app.Fragment fragment, String url, BaseTransform baseTransform, float breviary) {
        load(fragment, url, 0, 0, baseTransform, false, breviary);
    }

    public void load(android.app.Fragment fragment, String url, BaseTransform baseTransform) {
        load(fragment, url, 0, 0, baseTransform, false, 1.0f);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid) {
        load(fragment, url, placeHolderRid, 0);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        load(fragment, url, placeHolderRid, errorRid, null);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        load(fragment, url, placeHolderRid, 0, baseTransform);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        load(fragment, url, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    public void load(android.app.Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        load(fragment, url, placeHolderRid, errorRid, baseTransform, false, breviary);
    }

    //---------- Fragment ------------//
    public void load(Fragment fragment, String url) {
        load(fragment, url, 0);
    }

    public void load(Fragment fragment, String url, float breviary) {
        load(fragment, url, 0, 0, null, false, breviary);
    }

    public void load(Fragment fragment, String url, BaseTransform baseTransform, float breviary) {
        load(fragment, url, 0, 0, baseTransform, false, breviary);
    }

    public void load(Fragment fragment, String url, BaseTransform baseTransform) {
        load(fragment, url, 0, 0, baseTransform, false, 1.0f);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid) {
        load(fragment, url, placeHolderRid, 0);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid) {
        load(fragment, url, placeHolderRid, errorRid, null);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, BaseTransform baseTransform) {
        load(fragment, url, placeHolderRid, 0, baseTransform, 1.0f);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform) {
        load(fragment, url, placeHolderRid, errorRid, baseTransform, false, 1.0f);
    }

    public void load(Fragment fragment, String url, @DrawableRes int placeHolderRid, @DrawableRes int errorRid, BaseTransform baseTransform, float breviary) {
        load(fragment, url, placeHolderRid, errorRid, baseTransform, false, breviary);
    }
}
