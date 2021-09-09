package com.study.calculatorproject.services;

import com.study.calculatorproject.Entities.MathResultInfo;
import com.study.calculatorproject.enums.OperationType;
import com.study.calculatorproject.services.interfaces.CalculatorService;
import com.study.calculatorproject.utils.MathResultInfoMapper;
import org.springframework.stereotype.Service;

@Service
public class AdditionService implements CalculatorService {

    @Override
    public MathResultInfo calculate(int param1, int param2) {

        return MathResultInfoMapper.convert(param1, param2, OperationType.ADDITION.name(), param1 + param2);
    }
}
