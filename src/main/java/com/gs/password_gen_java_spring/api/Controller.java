package com.gs.password_gen_java_spring.api;

import com.gs.password_gen_java_spring.model.GenerateRequest;
import com.gs.password_gen_java_spring.service.GenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final GenerateService generateService;

    @Autowired
    public Controller(GenerateService generateService) {
        this.generateService = generateService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generate(
            @RequestBody GenerateRequest request
    ) {
        return ResponseEntity.status(200).body("");
    }
}
