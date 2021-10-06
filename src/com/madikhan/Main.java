package com.madikhan;

import com.madikhan.concreteFactory.IceCreamCafe;
import com.madikhan.factory.BaseIceCreamCafe;
import com.madikhan.product.IceCream;

public class Main {

    public static void main(String[] args) {
        BaseIceCreamCafe iceCreamCafe = new IceCreamCafe();

        IceCream cherryIceCream = new IceCreamCafe().createIceCream("Cherry");
        IceCream chocolateIceCream = new IceCreamCafe().createIceCream("Chocolate");

    }
}
