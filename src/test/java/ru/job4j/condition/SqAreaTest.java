package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP12K4Square8() {
        double expected = 8;
        int p = 12;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP20K4Square16() {
        double expected = 16;
        int p = 20;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}