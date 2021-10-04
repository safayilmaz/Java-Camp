package interfaceAbstractDemo;

import absracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer furkan = new Customer();
		furkan.setId(1);
		furkan.setFirstName("Muhammed Safa");
		furkan.setLastName("Yilmaz");
		furkan.setDateOfBirth(1992);
		furkan.setNationalityId("39961296634");
		customerManager.save(furkan);
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(furkan);
	}

}
