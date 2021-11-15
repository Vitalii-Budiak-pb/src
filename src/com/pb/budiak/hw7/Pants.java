package com.pb.budiak.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }

    @Override
    public void dressWomen() {
        System.out.println(this);
    }
}