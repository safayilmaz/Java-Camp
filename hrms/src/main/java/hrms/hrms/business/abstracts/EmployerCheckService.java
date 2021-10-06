package hrms.hrms.business.abstracts;

import hrms.hrms.entities.concretes.Employer;
import hrms.hrms.entities.concretes.User;

public interface EmployerCheckService {

    public void checkPassword(Employer employer);
    public boolean isConfirmedEmail(Employer employer);
    public void domainControl(Employer employer);
    public void emailControl(Employer employer);

}
