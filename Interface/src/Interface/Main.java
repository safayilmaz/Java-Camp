package Interface;

import javax.xml.crypto.Data;
import java.io.File;

public class Main {

    public static void main (String[] args){
    Logger[] loggers = { new DatabaseLogger(), new FileLogger()};
    Customer newCustomer = new Customer();
    newCustomer.setId(1);
    newCustomer.setFirstName("Safa");
    newCustomer.setLastName("Yilmaz");

    CustomerManager customerManager = new CustomerManager(loggers);
    customerManager.Add(newCustomer);

    }
}
