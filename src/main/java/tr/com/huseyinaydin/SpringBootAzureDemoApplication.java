package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAzureDemoApplication {

    @GetMapping("/mesaj")
    public String message(){
        return "Başarılı! Spring Boot projeni Azure üzerinde deploy ettin!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAzureDemoApplication.class, args);
    }
}