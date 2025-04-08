import java.util.Scanner;
public class pattern1{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:->");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}