package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        String idea = (String) ("I like Java!") + (String) (" But I am a newbie. ") + (int) (2023) + (String) ("!!!!!");
        System.out.println(idea);
    }
}
