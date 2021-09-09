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
@RequestMapping("/div")
public class DivisionController {

    CalculatorService calculatorService;

    @Autowired
    public DivisionController(@Qualifier("divisionService") CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(("/{param1}/{param2}"))
    public ResponseEntity<MathResultInfo> calculate(@PathVariable int param1, @PathVariable int param2) {
        return new ResponseEntity<>(calculatorService.calculate(param1, param2), HttpStatus.OK);
    }
}
