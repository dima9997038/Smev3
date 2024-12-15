package mipris.smev3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Smev3Application {

    public static void main(String[] args) {
        SpringApplication.run(Smev3Application.class, args);
    }

}
