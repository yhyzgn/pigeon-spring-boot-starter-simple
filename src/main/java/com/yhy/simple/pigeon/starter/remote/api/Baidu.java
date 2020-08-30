package com.yhy.simple.pigeon.starter.remote.api;

import com.yhy.http.pigeon.annotation.method.GET;
import com.yhy.http.pigeon.starter.annotation.HeaderClient;
import com.yhy.http.pigeon.starter.annotation.InterceptorClient;
import com.yhy.http.pigeon.starter.annotation.PigeonClient;
import com.yhy.simple.pigeon.starter.remote.interceptor.BaiduInterceptor;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2020-08-29 19:00
 * version: 1.0.0
 * desc   :
 */
@PigeonClient(
        name = "baidu",
        baseURL = "https://www.baidu.com",
        header = {
                @HeaderClient(name = "Local-Header", value = "Local API")
        },
        interceptor = {
                @InterceptorClient(value = BaiduInterceptor.class, net = true)
        })
public interface Baidu {

    @GET("/")
    String index();
}
