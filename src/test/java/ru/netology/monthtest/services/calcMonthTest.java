package ru.netology.monthtest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class calcMonthTest {
    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void test(int expected, int income, int expenses, int threshold) {


        calcMonth service = new calcMonth();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}