package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToYuan(float value) {
        float rsl = value / 13;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float yuan = rubleToYuan(140);
        System.out.println("140 rubles are " + yuan + " yuan.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inDollar = 140;
        double expectedDollar = 2.3333332538604736;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2.3333333. Test result : " + passedDollar);
        float inYuan = 140;
        double expectedYuan = 10.769230842590332;
        float outYuan = Converter.rubleToYuan(inYuan);
        boolean passedYuan = expectedYuan == outYuan;
        System.out.println("140 rubles are 10.769231. Test result : " + passedYuan);
    }
}
