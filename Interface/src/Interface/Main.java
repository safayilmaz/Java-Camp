package Interface;

import javax.xml.crypto.Data;

public class Main {

    public static void main (String[] args){

    Customer newCustomer = new Customer();
    newCustomer.setId(1);
    newCustomer.setFirstName("Safa");
    newCustomer.setLastName("Yilmaz");

    CustomerManager customerManager = new CustomerManager(new FileLogger());
    customerManager.Add(newCustomer);

    }
}
