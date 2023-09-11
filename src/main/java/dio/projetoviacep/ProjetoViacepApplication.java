package dio.projetoviacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProjetoViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoViacepApplication.class, args);
	}

}
