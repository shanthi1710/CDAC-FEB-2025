public class NarrowingTest {
	public static void main(String[] args){
		
		char ch = 'A';
		byte b = 5;
		short s = 5 ;
		int i = 5;
		long l = 5L;
		//float f = 5.50; // Error as floating point constants are treated as double
		float f = 5.55F;
		double d = 5.55;
		
		//Narrowing
		f = (float) d;  //LHS is float & RHS is double hence casting
		l = (long) f; //LHS is long & RHS is float hence casting
		i = (int) l; //LHS is int & RHS is long hence casting
		s = (short) i; //LHS is short & RHS is int hence casting
		b = (byte) s; //LHS is byte & RHS is short hence casting
		ch = (char) i;  //LHS is char & RHS is inthence casting 
		
		
		b += 4;  //b = (byte) (b + 4); LHS is byte and RHS is int  hence casting
		b = ++b; //b = ( byte) (b + b); LHS is byte and RHS is int hence casting
		b =  (byte) 4; // LHS is byte and RHS is int hence casting
		b =  (byte) i;	// LHS is byte and RHS is int hence casting	
		b =  ( byte) (b + 4); // LHS is byte and RHS is int hence casting
		b = ( byte) (b + b);  // LHS is byte and RHS is int hence casting
		//Special error cases
		//b =  ( byte) b + 4; //Error LHS is byte and RHS is int
		b =  (byte) (b + (byte)4); //LHS and RHS both are byte
		//b = b + b; // Error LHS is byte and RHS is int	
		//s = s + 4; //Error LHS is byte and RHS is int
		//s = s + s; //Error LHS is byte and RHS is int	
		System.out.println("Byte value = " + b);
	}
}