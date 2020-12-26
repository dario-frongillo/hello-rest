package it.italiancoders.hello.restdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value( "${hello.instanceId}" )
    private String instanceId;

    @GetMapping("/hello")
    ResponseEntity<String> getHello() {
        return ResponseEntity.ok("hello by instance:" + instanceId );
    }
}
