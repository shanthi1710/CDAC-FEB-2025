import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompareTester {
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = "";
	
	public static String getFormattedDate(Date date) { 
		//null check
		if ( null == date) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		return sdf.format(date);
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
		String formattedString = DateCompareTester.getFormattedDate(todaysDate);
		System.out.println(formattedString);
		
		
		
		System.out.println("Please enter date in dd/MM/yyyy format");
		Scanner sc = new Scanner(System.in);
		String strDate = sc.nextLine();
		Date date = DateCompareTester.getDate(strDate);
		System.out.println(date);
		System.out.println(DateCompareTester.getFormattedDate(date));
		sc.close();
		
		if(todaysDate.after(date)) {
			System.out.println("Date entered is past");
		}
		
		if(todaysDate.before(date)) {
			System.out.println("Date entered is future");
		}
		
		if (todaysDate.equals(date)) {
			System.out.println("Dates are equal");
		}
	}

}
