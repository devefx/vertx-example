package org.devefx.client;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.client.WebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

/**
 * MyClientApplication
 *
 * <p>Copyright (C) 上海比捷网络科技有限公司.</p>
 *
 * @author YueYouqian
 * @since 1.0
 */
@SpringBootApplication
public class MyClientApplication {
    @Autowired
    private WebClient client;

    public static void main(String[] args) {
        SpringApplication.run(MyClientApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void clientTestOk() {
        final JsonObject jsonObject = new JsonObject()
                .put("trackingChain", "1234568")
                .put("domain", "string")
                .put("language", "EN_US")
                .put("terminal", "OTHER")
                .put("body", new JsonObject()
                        .put("userId", 35061275)
                );

        System.out.println(jsonObject.toBuffer().length());

        client.post(8080, "127.0.0.1", "/private/userInfo").sendJsonObject(jsonObject, ar -> {
            if (ar.succeeded()) {
                System.out.println("1:========" + ar.result().body());
            } else {
                ar.cause().printStackTrace();
            }
        });
    }


    @EventListener(ApplicationReadyEvent.class)
    public void clientTestNoWork() {
        final JsonObject jsonObject = new JsonObject()
                .put("trackingChain", "123456789")
                .put("domain", "string")
                .put("language", "EN_US")
                .put("terminal", "OTHER")
                .put("body", new JsonObject()
                        .put("userId", 35061275)
                );

        System.out.println(jsonObject.toBuffer().length());

        client.post(8080, "127.0.0.1", "/private/userInfo").sendJsonObject(jsonObject, ar -> {
            if (ar.succeeded()) {
                System.out.println("2:========" + ar.result().body());
            } else {
                ar.cause().printStackTrace();
            }
        });
    }
}
