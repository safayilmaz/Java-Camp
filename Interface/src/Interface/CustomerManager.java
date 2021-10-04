package Interface;

public class CustomerManager {
    private Logger[] loggers;
    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void Add(Customer customer){
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " the customer has been added to DB");
    }

    public void Delete(Customer customer){
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " the customer has been deleted from DB");

    }
}
