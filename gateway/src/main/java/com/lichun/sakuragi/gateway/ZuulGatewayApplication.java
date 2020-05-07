package com.lichun.sakuragi.gateway;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(ZuulGatewayApplication.class)
        .web(WebApplicationType.SERVLET).run(args);
  }
}
