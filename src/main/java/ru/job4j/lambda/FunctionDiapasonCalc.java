package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDiapasonCalc {

    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> functionValue = new ArrayList<>();
        for (int i = start; i < end; i++) {
            functionValue.add(func.apply((double) i));
        }
        return functionValue;
    }
}
