package cn.jiyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("cn.jiyun.mapper")
public class StudentApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StudentApplication.class, args);


    }
}
