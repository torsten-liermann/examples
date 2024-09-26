package examples.spring_boot.test_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApplicationWithTestContainersTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationWithTestContainersTestApplication.class, args);
    }

    @RestController
    public class HelloWorldController {

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, World!";
        }
    }

}
