package concrete;

import absracts.BaseCustomerManager;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	public void save(Customer customer) {
	System.out.println(customer.getFirstName() + " "+ customer.getLastName() + " "+ " customer is added to db.");
	}
}
