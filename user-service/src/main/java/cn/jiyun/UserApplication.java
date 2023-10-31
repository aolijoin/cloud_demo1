package cn.jiyun;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;



@Slf4j
@EnableHystrix //熔断
@SpringBootApplication
@MapperScan("cn.jiyun.mapper")
public class UserApplication {
    public static void main(String[] args) {
        log.info("{}", args);
        ConfigurableApplicationContext run = SpringApplication.run(UserApplication.class, args);
        System.out.println(DateTime.now());
        System.out.println(IdUtil.objectId().length());
        System.out.println(DateTime.now());
    }
}
