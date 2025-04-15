package com.cdac.acts.comparator;

import java.util.Comparator;
import com.cdac.acts.fruit;

public class priceComparator implements Comparator<fruit> {
    @Override
    public int compare(fruit f1, fruit f2) {
        return Double.compare(f1.getPrice(), f2.getPrice());
    }
}