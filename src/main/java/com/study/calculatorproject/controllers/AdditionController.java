package com.study.calculatorproject.controllers;

import com.study.calculatorproject.Entities.MathResultInfo;
import com.study.calculatorproject.services.interfaces.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class AdditionController {

    CalculatorService calculatorService;

    @Autowired
    public AdditionController(@Qualifier("additionService") CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/{num1}/{num2}")
    public ResponseEntity<MathResultInfo> calculate(@PathVariable int num1, @PathVariable int num2) {
        return new ResponseEntity<>(calculatorService.calculate(num1, num2), HttpStatus.OK);
    }
}
