package AnnoExa_Two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableCaching
public class CosonleApplication {
    public static void main(String[] args) {

        SpringApplication.run(CosonleApplication.class, args);
    }
}
