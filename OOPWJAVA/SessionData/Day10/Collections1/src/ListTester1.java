import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListTester1 {

	public static void main(String[] args) {

		//Collection<E> I/F ->List<E> I/F -> ArrayList<E> CC
		ArrayList<Integer> integerList = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		String strChoice = "Y";
		while(strChoice.equals("Y")) {
			System.out.println(" Please enter number");
			Integer num = sc.nextInt();
			integerList.add(num);

			System.out.println(" Do you want to add more Y/N");
			sc.nextLine();
			strChoice = sc.nextLine();
		}
		//Retrieve using loop
		for(int i = 0 ; i < integerList.size(); i++) {
			System.out.println(integerList.get(i));
		}


		//Forward
		ListIterator<Integer> iterator  = integerList.listIterator();
		while(iterator.hasNext()){
			Integer ele = iterator.next();
			System.out.println(ele);
		}
		
		//Reverse
		System.out.println(integerList.size());
		ListIterator<Integer> iteratorReverse = integerList.listIterator(integerList.size());
		while(iteratorReverse.hasPrevious()){
			Integer ele = iteratorReverse.previous();
			System.out.println(ele);
		}
		
		//Advanced for
		for(Integer a : integerList) {
			System.out.println(a);
		}
		
		//Print using for each
		integerList.forEach(System.out::println);
		
//		int arr[] = new int[] {1,2,3};
//		for(int a : arr) {
//			System.out.println(a);
//		}
		
		sc.close();
	}

}
