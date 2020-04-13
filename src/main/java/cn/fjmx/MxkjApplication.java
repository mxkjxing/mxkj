package cn.fjmx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("cn.fjmx.mapper")
@Configuration
public class MxkjApplication {

	public static void main(String[] args) {
		SpringApplication.run(MxkjApplication.class, args);
	}

}
