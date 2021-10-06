package com.madikhan.product;

public abstract class IceCream {

    public abstract void prepareIceCreamCone();
    public abstract void putIceCreamIntoCone();
    public abstract void addCherry();
    public abstract void addChocolate();
    public abstract void addRaspberry();

    public void makeIceCream() {
        System.out.println("Ice cream will be ready in 5 minutes.");
    }
}
