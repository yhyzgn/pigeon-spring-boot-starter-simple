package com.yhy.simple.pigeon.starter.remote.api;

import com.yhy.http.pigeon.annotation.method.GET;
import com.yhy.http.pigeon.starter.annotation.Pigeon;
import com.yhy.http.pigeon.starter.annotation.PigeonHeader;
import com.yhy.http.pigeon.starter.annotation.PigeonInterceptor;
import com.yhy.simple.pigeon.starter.remote.interceptor.LocalInterceptor;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2020-08-29 17:43
 * version: 1.0.0
 * desc   :
 */
@Pigeon(
        name = "local",
        header = {
                @PigeonHeader(name = "Local-Header", value = "Local API")
        },
        interceptor = {
                @PigeonInterceptor(value = LocalInterceptor.class)
        }
)
public interface Local {

    @GET("/api/remote")
    String remote();
}
