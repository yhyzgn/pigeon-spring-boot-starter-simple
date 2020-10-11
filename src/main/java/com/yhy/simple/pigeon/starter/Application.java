package com.yhy.simple.pigeon.starter;

import com.yhy.http.pigeon.starter.EnablePigeon;
import com.yhy.http.pigeon.starter.annotation.PigeonHeader;
import com.yhy.http.pigeon.starter.annotation.PigeonInterceptor;
import com.yhy.simple.pigeon.starter.remote.interceptor.GlobalInterceptor;
import com.yhy.simple.pigeon.starter.remote.interceptor.GlobalNetInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePigeon(
        baseURL = "${pigeon.host}",
        header = {
                @PigeonHeader(name = "Token", value = "sdfSDFfdSD")
        },
        interceptor = {
                @PigeonInterceptor(value = GlobalInterceptor.class),
                @PigeonInterceptor(value = GlobalNetInterceptor.class, net = true)
        }
)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
