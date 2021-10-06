package hrms.hrms.business.concretes;

import hrms.hrms.business.abstracts.EmployeCheckService;
import hrms.hrms.business.abstracts.EmployerCheckService;
import hrms.hrms.entities.concretes.Employer;
import hrms.hrms.entities.concretes.User;

public class EmployerCheckManager implements EmployerCheckService {


    @Override
    public void checkPassword(Employer employer) {

    }

    @Override
    public boolean isConfirmedEmail(Employer employer) {
        return false;
    }

    @Override
    public void domainControl(Employer employer) {

    }

    @Override
    public void emailControl(Employer employer) {

    }
}
