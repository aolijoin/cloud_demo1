package cn.jiyun.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@LoadBalancerClient(value = "student"
        , configuration = LoadBalancerConfig.class)
public class BeanConfig {
    @Bean
    @LoadBalanced
    public RestTemplate resetTemplate() {
        return new RestTemplate();
    }
}
