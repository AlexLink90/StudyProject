package com.study.calculatorproject.Entities;

import lombok.Data;

@Data
public class MathResultInfo {
    private int operandOne;
    private int operandTwo;
    private String operation;
    private double result;
}
