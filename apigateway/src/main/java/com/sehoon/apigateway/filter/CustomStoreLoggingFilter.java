package com.sehoon.apigateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class CustomStoreLoggingFilter extends AbstractGatewayFilterFactory<CustomStoreLoggingFilter.Config> {

    public CustomStoreLoggingFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            ServerHttpResponse response = exchange.getResponse();

            log.info("Custom Log - Request: {} {}", request.getMethod(), request.getURI());

            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("Custom Log - Response: {}", response.getStatusCode());
            }));
        };
    }

    public static class Config {
        // Put the configuration properties for your filter here
    }
}