package jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fact {

    @GetMapping("/api/fact")
    public long factorial(@RequestParam int n) {

        long fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}