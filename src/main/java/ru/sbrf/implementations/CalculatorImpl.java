package ru.sbrf.implementations;

import ru.sbrf.interfaces.Calculator;

import java.util.Arrays;
import java.util.List;

public class CalculatorImpl implements Calculator {

    @Override
    public List<Integer> fibonachi(int number) {
        Integer[] arr = new Integer[number];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return Arrays.asList(arr);
    }
}
