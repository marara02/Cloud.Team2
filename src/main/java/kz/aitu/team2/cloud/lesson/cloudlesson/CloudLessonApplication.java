package kz.aitu.team2.cloud.lesson.cloudlesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;


@SpringBootApplication
@RestController

public class CloudLessonApplication {
    private ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(CloudLessonApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        this.names.add(name);
        return String.format("Hello %s!", name);
    }

    @GetMapping("/page")
    public String showHomePage() {
        return "main";
    }

    @GetMapping("/list")
    public String listCollection() {
        Collections.sort(this.names);
        return String.format("Hello %s!", this.names.toString()
                .replace("[", "")
                .replace("]", "")
        );
    }
}
