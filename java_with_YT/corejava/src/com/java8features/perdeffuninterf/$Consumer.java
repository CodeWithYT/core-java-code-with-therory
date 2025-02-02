package com.java8features.perdeffuninterf;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class $Consumer {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("tarun","phani", "goffor" );
        Consumer<String> f1 = (s1) -> System.out.println(s1);
        Consumer<String> f2 = (s1) -> System.out.println(s1.length());
        Consumer<String> f3 = f1.andThen(f2);

        for (String name: names) {
            f3.accept(name);
        }
    }
}
