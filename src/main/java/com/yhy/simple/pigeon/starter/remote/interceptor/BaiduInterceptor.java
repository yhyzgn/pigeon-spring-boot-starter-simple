package com.yhy.simple.pigeon.starter.remote.interceptor;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.Response;

import javax.annotation.Nonnull;
import java.io.IOException;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2020-08-29 23:30
 * version: 1.0.0
 * desc   :
 */
@Slf4j
public class BaiduInterceptor implements Interceptor {

    @Override
    @Nonnull
    public Response intercept(Chain chain) throws IOException {
        log.info("Baidu网络拦截器执行了！");
        return chain.proceed(chain.request());
    }
}
