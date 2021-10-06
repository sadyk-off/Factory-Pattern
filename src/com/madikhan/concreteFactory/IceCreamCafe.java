package com.madikhan.concreteFactory;

import com.madikhan.concreteProduct.CherryIceCream;
import com.madikhan.concreteProduct.ChocolateIceCream;
import com.madikhan.factory.BaseIceCreamCafe;
import com.madikhan.product.IceCream;

public class IceCreamCafe extends BaseIceCreamCafe {
    @Override
    public IceCream createIceCream(String type) {
        IceCream iceCream;
        switch(type.toLowerCase()) {
            case "cherry":
                iceCream = new CherryIceCream();
                break;
            case "chocolate":
                iceCream = new ChocolateIceCream();
                break;
            default: throw new IllegalArgumentException("No such Ice Cream =(");
        }

        iceCream.prepareIceCreamCone();
        iceCream.putIceCreamIntoCone();
        iceCream.addCherry();
        iceCream.makeIceCream();

        return iceCream;
    }
}
