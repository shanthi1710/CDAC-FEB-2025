package com.cdac.acts.comparator;
import java.util.Comparator;
import com.cdac.acts.fruit;

public class qtyComparator implements Comparator<fruit>{
	 @Override
	    public int compare(fruit f1, fruit f2) {
	        return Integer.compare(f1.getQuantity(), f2.getQuantity());
	    }
}
