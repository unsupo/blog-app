package app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
@CrossOrigin
public class AppController {
    @RequestMapping("/")
    @ResponseBody
    public String greeting(@RequestHeader(value="name", defaultValue = "World") String name){
        return "Hello "+name;
    }
}
