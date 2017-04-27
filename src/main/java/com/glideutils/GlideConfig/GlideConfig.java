package com.glideutils.GlideConfig;

/**
 * description: Glide配置相关
 * author: WDSG
 * date: 2017/3/27
 */
public class GlideConfig {
    // 图片缓存最大容量，150M，根据自己的需求进行修改
    public static final int GLIDE_CATCH_SIZE = 150 * 1000 * 1000;

    // 图片缓存子目录
    public static final String GLIDE_CARCH_DIR = "image_cache_app";

    public static int getGlideCatchSize() {
        return GLIDE_CATCH_SIZE;
    }

    public static String getGlideCarchDir() {
        return GLIDE_CARCH_DIR;
    }
}
