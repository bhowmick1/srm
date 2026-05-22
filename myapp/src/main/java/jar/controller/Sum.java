package jar.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Sum {

    @GetMapping("/api/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {

        return a + b;
    }
}
