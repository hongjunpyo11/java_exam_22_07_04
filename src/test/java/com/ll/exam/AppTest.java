package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void 더하기() {
        int rs = Calculator.add("10 + 20");

        assertEquals(30, rs);
    }

    public void 더하기2() {
        int rs = Calculator.add("20 + 20");

        assertEquals(40, rs);
    }
}
