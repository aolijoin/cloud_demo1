package cn.jiyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("cn.jiyun.mapper")
@SpringBootApplication
public class TeacherApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(TeacherApplication.class, args);
    }
}
