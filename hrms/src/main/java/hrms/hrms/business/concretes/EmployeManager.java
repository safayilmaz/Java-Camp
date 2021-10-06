package hrms.hrms.business.concretes;

import hrms.hrms.business.abstracts.EmployeService;
import hrms.hrms.dataAccess.abstracts.EmployeeDao;
import hrms.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeManager implements EmployeService {

    private EmployeeDao employeDao;

    @Autowired
    public EmployeManager(EmployeeDao employeDao) {
        this.employeDao = employeDao;
    }

    @Override
    public void add(Employee employe) {

    }

    @Override
    public void delete(Employee employe) {

    }

    @Override
    public void update(Employee employe) {

    }
}
