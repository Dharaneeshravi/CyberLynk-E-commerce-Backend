package in.ciberlynk.cyberlynk_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class CyberlynkEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyberlynkEcommerceApplication.class, args);
	}

}
