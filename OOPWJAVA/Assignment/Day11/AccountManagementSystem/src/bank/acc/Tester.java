package bank.acc;
import java.util.*;
import java.time.LocalDate;
import java.util.function.Consumer;

public class Tester {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        List<Account> unmodifiableList = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add account");
            System.out.println("2. Print all accounts");
            System.out.println("3. Create unmodifiable list");
            System.out.println("4. Use upper bound");
            System.out.println("5. Use lower bound");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try{
                        System.out.print("Enter acc no: ");
                        int accNo = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter acc name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter opening balance: ");
                        double balance = sc.nextDouble();
                        Boolean check = ValidationUtil.checkBalance(balance);
                        //if ( !ValidationUtil.checkBalance(balance))
                        Account acc = new Account(name, balance);
                        accounts.add(acc);
                        System.out.println("Account added."); 
                    }
                    break;

                case 2:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts available.");
                    } else {
                        accounts.forEach(Account::display);
                    }
                    break;

                case 3:
                    unmodifiableList = Collections.unmodifiableList(accounts);
                    System.out.println("Unmodifiable list created.");
                    break;

                case 4: // Upper bound: Read-only
                    printBalancesUpperBound(accounts);
                    break;

                case 5: // Lower bound: Add possible
                    addDummyAccountLowerBound(accounts);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Method using upper bound wildcard
    public static void printBalancesUpperBound(List<? extends Account> list) {
        System.out.println("Account balances (using upper bound):");
        for (Account acc : list) {
            System.out.println("₹" + acc.getBalance());
        }
    }

    // Method using lower bound wildcard
    public static void addDummyAccountLowerBound(List<? super Account> list) throws MinimumBalanceException {
        list.add(new Account());
		System.out.println("Dummy account added using lower bound.");
    }
}
