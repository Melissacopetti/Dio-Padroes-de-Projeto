package dio.padroesSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class PadroesDeProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetoSpringApplication.class, args);
	}

}
