package esprit.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mic2/job")
@RestController
public class JobRestAPI {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Microservice";


    }
}
