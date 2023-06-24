package org.example.controller;

import org.example.model.AdditionResponse;
import org.example.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping(value = "/addition")
    public ResponseEntity<AdditionResponse> performAddition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorService.add(num1, num2);
        AdditionResponse response = new AdditionResponse(num1, num2, result);
        return ResponseEntity.ok(response);
    }
}

