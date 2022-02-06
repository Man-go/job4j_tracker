package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionDiapasonCalcTest {

    @Test
    public void whenLinearFunction() {
        FunctionDiapasonCalc dc = new FunctionDiapasonCalc();
        List<Double> result = dc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        FunctionDiapasonCalc dc = new FunctionDiapasonCalc();
        List<Double> result = dc.diapason(5, 8, x -> 5 * x * x + 3);
        List<Double> expected = Arrays.asList(128D, 183D, 248D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunction() {
        FunctionDiapasonCalc dc = new FunctionDiapasonCalc();
        List<Double> result = dc.diapason(5, 8, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(3125D, 46656D, 823543D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunction2() {
        FunctionDiapasonCalc dc = new FunctionDiapasonCalc();
        List<Double> result = dc.diapason(2, 5, x -> Math.pow(7, x) + 3);
        List<Double> expected = Arrays.asList(52D, 346D, 2404D);
        assertThat(result, is(expected));
    }
}