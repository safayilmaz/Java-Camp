package hrms.hrms.business.abstracts;

import hrms.hrms.entities.concretes.Employee;

public interface EmployeService {

    public void add (Employee employe);
    public void delete (Employee employe);
    public void update (Employee employe);

}
