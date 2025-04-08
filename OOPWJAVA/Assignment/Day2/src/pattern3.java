public class pattern3{
	public static void main(String []args){
		for (int i = 0; i < 4; i++){
			for(int j = 0; j < 4 - i; j++){
				System.out.print("*");
			};
			for(int j = 1; j < 1 + 2 * i; j++){
				System.out.print(" ");
			};
			for(int j = 0; j < 4 - i; j++){
				System.out.print("*");
			};
			System.out.println();
	 };
		
	}
}