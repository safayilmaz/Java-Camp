package hrms.hrms.business.abstracts;

import hrms.hrms.entities.concretes.Employer;

public interface EmployerService {
    public void add (Employer employer);
    public void delete (Employer employer);
    public void update (Employer employer);
}
