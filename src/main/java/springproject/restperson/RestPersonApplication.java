package springproject.restperson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestPersonApplication.class, args);
	}

	public static int sum(int num1, int num2){
		return num1 + num2;
	}
}
