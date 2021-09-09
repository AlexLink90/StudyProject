package com.study.calculatorproject.services.interfaces;

import com.study.calculatorproject.Entities.MathResultInfo;
import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    MathResultInfo calculate(int param1, int param2);
}
