package io.edcracken.xeroclient;

import com.xero.api.XeroClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class XeroClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(XeroClientApplication.class, args);
    }

    @Bean
    public XeroClient xeroClient(XeroConfig config) {
        XeroClient client = new XeroClient(config);
        client.setOAuthToken(config.getConsumerKey(), config.getConsumerSecret());
        return client;
    }
}
