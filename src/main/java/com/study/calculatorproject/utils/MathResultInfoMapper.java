package com.study.calculatorproject.utils;

import com.study.calculatorproject.Entities.MathResultInfo;
import com.study.calculatorproject.enums.OperationType;

public class MathResultInfoMapper {

   static public MathResultInfo convert(int param1, int param2, OperationType operation, double result) {
        MathResultInfo mathResultInfo = new MathResultInfo();
        mathResultInfo.setOperandOne(param1);
        mathResultInfo.setOperandTwo(param2);
        mathResultInfo.setOperation(operation);
        mathResultInfo.setResult(result);
        return mathResultInfo;
    }
}
