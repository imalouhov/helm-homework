package demo.helm.homework.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    ResponseEntity<String> test() {
        return ResponseEntity.ok("I`m ok");
    }
}
