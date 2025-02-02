package com.comparable;

public class EncapsulatedComparable implements Comparable<EncapsulatedComparable>{
    String name;
    int price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public EncapsulatedComparable(){}
    public EncapsulatedComparable(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Test [name=" + name + ", price=" + price + "]";
    }

        @Override
        public int compareTo(EncapsulatedComparable o) {
            if(this.price < o.price) {
                return -1;
            }
            else if (this.price > o.price) {
                return 1;
            }
            else {
                return 0;
            }
        }


}