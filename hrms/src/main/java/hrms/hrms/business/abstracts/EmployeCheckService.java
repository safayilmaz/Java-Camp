package hrms.hrms.business.abstracts;

import hrms.hrms.entities.concretes.Employee;
import hrms.hrms.entities.concretes.User;

public interface EmployeCheckService {
    public void checkPassword(Employee employee);
    public boolean isConfirmedEmail(Employee employee);
    public void nameControl(Employee employee);
    public void surnameControl(Employee employee);
}
