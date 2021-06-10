package sample.jung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //Spring-Boot-DB설정-없이-실행하기
public class JungApplication {

	public static void main(String[] args) {
		SpringApplication.run(JungApplication.class, args);
	}
}
