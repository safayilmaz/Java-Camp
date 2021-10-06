package hrms.hrms.business.concretes;

import hrms.hrms.business.abstracts.EmployeCheckService;
import hrms.hrms.entities.concretes.Employee;
import hrms.hrms.entities.concretes.User;

public class EmployeCheckManager implements EmployeCheckService {
    @Override
    public void checkPassword(Employee employee) {

    }

    @Override
    public boolean isConfirmedEmail(Employee employee) {
        return false;
    }

    @Override
    public void nameControl(Employee employee) {

    }

    @Override
    public void surnameControl(Employee employee) {

    }
}
