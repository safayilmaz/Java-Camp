package hrms.hrms.dataAccess.abstracts;

import hrms.hrms.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    public void add(Employee employee);
}
