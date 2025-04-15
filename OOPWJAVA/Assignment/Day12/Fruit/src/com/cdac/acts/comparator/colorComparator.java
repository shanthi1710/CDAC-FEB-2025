package com.cdac.acts.comparator;
import java.util.Comparator;
import com.cdac.acts.fruit;
public class colorComparator implements Comparator<fruit> {
	@Override
	public int compare(fruit f1,fruit f2) {
		return f1.getColor().compareTo(f2.getColor());
	}
}
