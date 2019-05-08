package org.devefx.client.config;

import io.vertx.core.Vertx;
import io.vertx.ext.web.client.WebClient;
import io.vertx.ext.web.client.WebClientOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * VertxConfig
 *
 * <p>Copyright (C) 上海比捷网络科技有限公司.</p>
 *
 * @author YueYouqian
 * @since 1.0
 */
@Configuration
public class VertxConfig {
    @Bean
    public Vertx vertx() {
        return Vertx.vertx();
    }
    @Bean
    public WebClient webClient() {
        return WebClient.create(vertx(), new WebClientOptions().setConnectTimeout(2000));
    }
}
