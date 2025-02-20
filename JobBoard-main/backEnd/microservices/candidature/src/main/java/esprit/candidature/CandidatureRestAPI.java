package esprit.candidature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mic3/candidature")
@RestController
public class CandidatureRestAPI {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Microservice";


    }
}
