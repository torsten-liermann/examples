package examples.spring_boot.test_application;

import org.springframework.boot.SpringApplication;

public class TestApplicationWithContainersApplication {

    public static void main(String[] args) {
        SpringApplication.from(ApplicationWithTestContainersTestApplication::main).with(TestcontainersConfiguration.class).run(args);
    }



}
