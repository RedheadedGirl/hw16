package ru.sbrf;

import java.util.List;

public interface Calculator {

    @Cachable
    List<Integer> fibonachi(int number);

}
