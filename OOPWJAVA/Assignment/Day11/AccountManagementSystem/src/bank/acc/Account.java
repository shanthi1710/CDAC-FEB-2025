package bank.acc;

import java.time.LocalDate;

public class Account {
	private Integer accNo;
	private String accName;
	private LocalDate dateOfOpening;
	private Double balance;
	private static Integer genAccNo = 100;
	
	public Account() {
		this.accNo = ++genAccNo;
		this.accName = "";
		this.dateOfOpening = LocalDate.now();
		this.balance = 0.0;
	}

	public Account(String accName, Double balance) {
		this.accNo = ++genAccNo;
		this.accName = accName;
		this.dateOfOpening = LocalDate.now();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account No : " + accNo + 
			   "| Name : " + accName +
			   "| Date Of Opening : " + dateOfOpening + 
			   "| Balance : "
				+ balance;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}

//Menu:
//1.     Add account
//2.     Print all accounts
//3.     Create  unmodifiable from existing list
//4. Use Upper bound
//5. User lower bound
//7.       exit
