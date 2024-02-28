package ru.sbrf;

import ru.sbrf.implementations.CacheableProxy;
import ru.sbrf.implementations.CalculatorImpl;
import ru.sbrf.interfaces.Calculator;

import java.lang.reflect.Proxy;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassLoader cl = CalculatorImpl.class.getClassLoader();
        Calculator cachedCalculator = (Calculator) Proxy.newProxyInstance(cl, new Class[] {Calculator.class},
                new CacheableProxy(new CalculatorImpl()));
        List<Integer> fibonachi = cachedCalculator.fibonachi(5);
        fibonachi.forEach(System.out::println);
    }
}
