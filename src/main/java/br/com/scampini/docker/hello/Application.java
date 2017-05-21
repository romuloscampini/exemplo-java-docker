package br.com.scampini.docker.hello;

/**
 * Created by romuloscampini on 5/13/17.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "<h2>Welcome to Java with Docker</h2>";
    }

    public static void main(String[] args) { SpringApplication.run(Application.class, args); }

}
