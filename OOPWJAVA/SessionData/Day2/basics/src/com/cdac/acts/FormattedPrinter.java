package com.cdac.acts;

public class FormattedPrinter {
	public static void main(String[] args) {
		boolean flag = true;
		System.out.printf("\n boolean: %b", flag);

		byte b = 104;
		System.out.printf("\n byte	: %d", b);

		short s = 1432;
		System.out.printf("\n short	: %d", s);

		char ch = 'Z';
		System.out.printf("\n char	: %c", ch);

		int i = 32700;
		System.out.printf("\n int	: %d", i);

		long l = 9876598765L;
		System.out.printf("\n long	: %d", l);

		float f = 9999.5600F;
		System.out.printf("\n float	: %f", f);
		System.out.printf("\n float	: %g", f);
		System.out.printf("\n float	: %e", f);

		double d = 989856565.35688;
		System.out.printf("\n double : %f", d);
		System.out.printf("\n double : %.2f", d);
		System.out.printf("\n double : %g", d);
		System.out.printf("\n double : %e", d);

		System.out.printf("\n String : %s", "I love java");
	}
}
