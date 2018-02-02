package com.example;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by maomao on 18/2/1.
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
