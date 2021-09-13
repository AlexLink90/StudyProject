package com.study.calculatorproject.services;

import com.study.calculatorproject.Entities.MathResultInfo;
import com.study.calculatorproject.enums.OperationType;
import com.study.calculatorproject.services.interfaces.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MultiplicationServiceTest {

    @Autowired
    private CalculatorService multiplicationService;

    @Test
    void calculate(){
        MathResultInfo result = multiplicationService.calculate(3,2);
        Assertions.assertEquals(result.getResult(),6);
        Assertions.assertEquals(result.getOperandOne(),3);
        Assertions.assertEquals(result.getOperandTwo(),2);
        Assertions.assertEquals(result.getOperation(), OperationType.MULTIPLICATION);
    }
}
