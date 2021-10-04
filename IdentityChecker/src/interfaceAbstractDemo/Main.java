package interfaceAbstractDemo;

import absracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Muhammed Safa");
		customer.setLastName("Yilmaz");
		customer.setDateOfBirth(1992);
		customer.setNationalityId("39961296634");
		customerManager.save(customer);
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(customer);
	}

}
