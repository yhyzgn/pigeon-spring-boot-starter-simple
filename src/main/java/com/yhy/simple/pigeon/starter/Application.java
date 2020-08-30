package com.yhy.simple.pigeon.starter;

import com.yhy.http.pigeon.starter.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnablePigeonClient(
//        baseURL = "${pigeon.host}",
//        basePackages = "com.yhy.simple.pigeon.starter",
//        header = {
//                @HeaderClient(name = "Token", value = "sdfSDFfdSD")
//        },
//        interceptor = {
//                @InterceptorClient(value = GlobalInterceptor.class),
//                @InterceptorClient(value = GlobalNetInterceptor.class, net = true)
//        }
//)
@MapperScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
