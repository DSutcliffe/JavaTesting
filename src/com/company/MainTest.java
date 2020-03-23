package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;

    @BeforeEach
    void setup() {
        this.main = new Main();
    }

    @AfterEach
    void tearDown() {
        // Reset values used in test
    }

    @org.junit.jupiter.api.Test
    void add() {
        float numberOne = 41;
        float numberTwo = 44;
        float expected = 85;
        float actual;

        actual = this.main.add(numberOne, numberTwo);
        assertEquals(expected, actual);
    }

//    @TEST // Option + Enter
    @org.junit.jupiter.api.Test
    void myNextTest() {
        String[] expectedOutput = {"Dean", "Jepson", "Bourne"};
        String[] methodOutput = {"Dean", "Jepson", "Bourne"};

        assertArrayEquals(expectedOutput, methodOutput);
    }

    @org.junit.jupiter.api.Test
    public void multiplicationTest() {
        assertEquals(1518, main.multiply(69, 22), "69 times 22 equals 1518"
        );
    }
}