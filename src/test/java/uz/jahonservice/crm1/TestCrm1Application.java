package uz.jahonservice.crm1;

import org.springframework.boot.SpringApplication;

public class TestCrm1Application {

    public static void main(String[] args) {
        SpringApplication.from(Crm1Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
