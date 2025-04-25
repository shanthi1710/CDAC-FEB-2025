package bank.acc;

public class ValidationUtil {
	public static Boolean checkBalance(Double Balance) throws MinimumBalanceException {
		try {
			if (Balance < 1000) {
				throw new MinimumBalanceException("Minimum Balance should be atleast 1000");
			} else {
				return true;
			}
		} finally {
			
		}
	}
}
