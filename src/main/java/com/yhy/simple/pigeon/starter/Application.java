package com.yhy.simple.pigeon.starter;

import com.yhy.http.pigeon.starter.EnablePigeonClient;
import com.yhy.http.pigeon.starter.annotation.HeaderClient;
import com.yhy.http.pigeon.starter.annotation.InterceptorClient;
import com.yhy.simple.pigeon.starter.remote.interceptor.GlobalInterceptor;
import com.yhy.simple.pigeon.starter.remote.interceptor.GlobalNetInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePigeonClient(
        baseURL = "${pigeon.host}",
        basePackages = "com.yhy.simple.pigeon.starter",
        header = {
                @HeaderClient(name = "Token", value = "sdfSDFfdSD")
        },
        interceptor = {
                @InterceptorClient(value = GlobalInterceptor.class),
                @InterceptorClient(value = GlobalNetInterceptor.class, net = true)
        }
)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
