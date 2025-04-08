public class Test {
	public static void main(String[] args){
		int value =10;
		System.out.printf("\n int value= %d", value);
		// error as value is unintialized	
		
		char ch = 'A';
		int intAscii = (int) ch;
		System.out.printf("\n ASCII value of  %c = %d", ch, intAscii);	
		
	}
}