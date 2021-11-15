package com.pb.budiak.hw7;

public class Tie extends Clothes implements ManClothes {

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }
}