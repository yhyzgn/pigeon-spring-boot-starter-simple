package com.yhy.simple.pigeon.starter.remote.api;

import com.yhy.http.pigeon.annotation.method.GET;
import com.yhy.http.pigeon.starter.annotation.Header;
import com.yhy.http.pigeon.starter.annotation.Interceptor;
import com.yhy.http.pigeon.starter.annotation.Pigeon;
import com.yhy.simple.pigeon.starter.remote.interceptor.LocalInterceptor;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2020-08-29 17:43
 * version: 1.0.0
 * desc   :
 */
@Pigeon(
        header = {
                @Header(name = "Local-Header", value = "Local API")
        },
        interceptor = {
                @Interceptor(value = LocalInterceptor.class)
        }
)
public interface Local {

    @GET("/api/remote")
    String remote();
}
