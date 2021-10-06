package com.madikhan.concreteProduct;

import com.madikhan.product.IceCream;

public class CherryIceCream extends IceCream {

    @Override
    public void prepareIceCreamCone() {
        System.out.println("Preparing cone for Cherry Ice Cream...");
    }

    @Override
    public void putIceCreamIntoCone() {
        System.out.println("Putting ice cream into the cone for Cherry Ice Cream...");
    }

    @Override
    public void addCherry() {
        System.out.println("Adding cherry into the ice cream...");
    }

    @Override
    public void addChocolate() {

    }

    @Override
    public void addRaspberry() {

    }
}
