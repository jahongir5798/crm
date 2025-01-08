package uz.jahonservice.crm1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Crm1Application {

    public static void main(String[] args) {
        SpringApplication.run(Crm1Application.class, args);
    }

}
