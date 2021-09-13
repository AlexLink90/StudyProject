package com.study.calculatorproject.services;

import com.study.calculatorproject.Entities.MathResultInfo;
import com.study.calculatorproject.enums.OperationType;
import com.study.calculatorproject.services.interfaces.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DivisionServiceTest {

    @Autowired
    private CalculatorService divisionService;

    @Test
    void calculate(){
        MathResultInfo result = divisionService.calculate(2,2);
        Assertions.assertEquals(result.getResult(),1);
        Assertions.assertEquals(result.getOperandOne(),2);
        Assertions.assertEquals(result.getOperandTwo(),2);
        Assertions.assertEquals(result.getOperation(), OperationType.DIVISION);
    }
}
