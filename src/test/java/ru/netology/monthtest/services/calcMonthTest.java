package ru.netology.monthtest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class calcMonthTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/monthtest.csv"

    )
    public void test(int expected, int income, int expenses, int threshold) {


        calcMonth service = new calcMonth();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}