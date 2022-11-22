import java.util.Scanner;

public class Customer {

	private String addressOfCustomer;

	public Customer(String address) {
		this.addressOfCustomer = address;
	}

	public boolean checkAddress() {
		String addressForCheck;
		boolean isEquals = false;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the address for check: ");
		addressForCheck = scanner.nextLine();
		scanner.close();

		if (addressForCheck.equals(addressOfCustomer)) {
			isEquals = true;
		} else {
			isEquals = false;
		}

		return isEquals;
	}

}
