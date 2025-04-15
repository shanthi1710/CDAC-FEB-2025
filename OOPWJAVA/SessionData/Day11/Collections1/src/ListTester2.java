import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListTester2 {

	public static List<Integer> getArrayList() {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(90);
		integerList.add(60);
		integerList.add(30);
		integerList.add(40);
		return integerList;
	}

	public static void main(String[] args) {

		//Collection<E> I/F ->List<E> I/F -> ArrayList<E> CC
		List<Integer> integerList = getArrayList();
		//Advanced for
		for(Integer a : integerList) {
			System.out.println(a);
		}

		integerList.remove(2);

		//Advanced for
		System.out.println("After removal");
		for(Integer a : integerList) {
			System.out.println(a);
		}
		//Concurrent Modification
		for(Integer a : integerList) {
			System.out.println(a);
			integerList.add(a);
		}
		
		Collections.sort(integerList);
		System.out.println("After sorting");
		for(Integer a : integerList) {
			System.out.println(a);
		}
		
	}
}
