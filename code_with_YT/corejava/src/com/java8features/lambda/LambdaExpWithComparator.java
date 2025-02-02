package com.java8features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop{
    private int price;
    private int ram;
    private String name;

    Laptop(){}

    public Laptop(int price, int ram, String name) {
        this.price = price;
        this.ram = ram;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", ram=" + ram +
                ", name='" + name + '\'' +
                '}';
    }
}
public class LambdaExpWithComparator {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        Laptop [] arr = {
                new Laptop(20000,8,"asus"),
                new Laptop(30000,16, "hp"),
                new Laptop(10000,4, "zen"),
                new Laptop(60000,16, "dell"),
                new Laptop(15000,4, "samsung"),
        };
        List <Laptop> li = Arrays.asList(arr);
        Comparator<Laptop>comp = (o1,o2) -> Integer.compare(o2.getPrice(), o1.getPrice());
        Collections.sort(li,comp);
        for(Laptop laptop : li){
            System.out.println(laptop);
        }
    }
}
