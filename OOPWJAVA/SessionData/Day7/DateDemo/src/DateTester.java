import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTester {
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";
	
	public static String getFormattedDate(Date date) { 
		//null check
		if ( null == date) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.format(date);
		
//		String formattedString = sdf.format(date);
//		return formattedString;
	}
	
	/*
	 * this method takes String and returns date object
	 */
	public static Date getDate(String strDate) throws ParseException { 
		//null check
		if ( null == strDate || EMPTY.equals(strDate)) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(strDate);
		return date;
	}
	public static void main(String[] args) throws ParseException {
		//Create Date object
		Date todaysDate = new Date();
		System.out.println(todaysDate);
		String formattedString = DateTester.getFormattedDate(todaysDate);
		System.out.println(formattedString);
		
		
		
		System.out.println("Please enter date in dd/MM/yyyy format");
		Scanner sc = new Scanner(System.in);
		String strDate = sc.nextLine();
		Date date = DateTester.getDate(strDate);
		System.out.println(date);
		System.out.println(DateTester.getFormattedDate(date));
		sc.close();
		
	}

}
