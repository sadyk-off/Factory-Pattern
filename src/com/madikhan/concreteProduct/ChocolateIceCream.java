package com.madikhan.concreteProduct;

import com.madikhan.product.IceCream;

public class ChocolateIceCream extends IceCream {
    @Override
    public void prepareIceCreamCone() {
        System.out.println("Preparing cone for Chocolate Ice Cream...");
    }

    @Override
    public void putIceCreamIntoCone() {
        System.out.println("Putting ice cream into the cone for Chocolate Ice Cream...");
    }

    @Override
    public void addCherry() {

    }

    @Override
    public void addChocolate() {
        System.out.println("Adding chocolate into the ice cream...");
    }

    @Override
    public void addRaspberry() {

    }
}
