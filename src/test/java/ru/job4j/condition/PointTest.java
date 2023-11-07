package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void distance() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void distance1() {
        double expected = 2.23606797749979;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void distance2() {
        double expected = 2.23606797749979;
        int x1 = 4;
        int y1 = 4;
        int x2 = 2;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}