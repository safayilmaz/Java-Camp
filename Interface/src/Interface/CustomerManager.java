package Interface;

public class CustomerManager {
    private Logger logger;
    public CustomerManager(Logger logger) {
        this.logger = logger;
    }


    public void Add(Customer customer){
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " the customer has been added to DB");
    }

    public void Delete(Customer customer){
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " the customer has been deleted from DB");

    }
}
