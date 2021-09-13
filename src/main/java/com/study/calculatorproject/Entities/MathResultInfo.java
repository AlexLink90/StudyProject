package com.study.calculatorproject.Entities;

import com.study.calculatorproject.enums.OperationType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MathResultInfo {
    private int operandOne;
    private int operandTwo;
    private OperationType operation;
    private double result;
}
