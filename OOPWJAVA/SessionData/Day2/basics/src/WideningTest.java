public class WideningTest {
	public static void main(String[] args){
		char ch = 'A';
		byte b = 5;
		short s = 5 ;
		int i = 5;
		long l = 5L;
		//float f = 5.50; // Error as floating point constants are treated as double
		float f = 5.55F;
		double d = 5.55;
		
		//Promotions
		d = f; //LHS is double & RHS is float
		f = l; //LHS is float & RHS is long
		l = i; //LHS is long & RHS is int
		i = s; //LHS is long & RHS is int
		s = b; //LHS is short & RHS is byte
		d = l + s; //LHS is double & RHS is long
		l = ch; //LHS is long & RHS is char
		
		System.out.println("Long value=" + l);

	}
}