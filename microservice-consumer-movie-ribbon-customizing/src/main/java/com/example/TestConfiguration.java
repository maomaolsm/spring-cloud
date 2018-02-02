package com.example;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by maomao on 18/2/1.
 */
@Configuration
@RibbonClient(name = "microservice-provider-user",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
