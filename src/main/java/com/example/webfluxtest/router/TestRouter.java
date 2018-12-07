package com.example.webfluxtest.router;

import com.example.webfluxtest.handler.TestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author liuwe liuwei@flksec.com
 * @date 2018/11/19
 * @since 1.0
 */
@Configuration
public class TestRouter {
    
    @Bean
    public RouterFunction<ServerResponse> routeCity(TestHandler cityHandler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        cityHandler::hello);
    }
}
