package com.yhy.simple.pigeon.starter.remote.api;

import com.yhy.http.pigeon.annotation.method.GET;
import com.yhy.http.pigeon.starter.annotation.HeaderClient;
import com.yhy.http.pigeon.starter.annotation.InterceptorClient;
import com.yhy.http.pigeon.starter.annotation.PigeonClient;
import com.yhy.simple.pigeon.starter.remote.interceptor.LocalInterceptor;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2020-08-29 17:43
 * version: 1.0.0
 * desc   :
 */
@PigeonClient(
        name = "local",
        header = {
                @HeaderClient(name = "Local-Header", value = "Local API")
        },
        interceptor = {
                @InterceptorClient(value = LocalInterceptor.class)
        }
)
public interface Local {

    @GET("/api/remote")
    String remote();
}
