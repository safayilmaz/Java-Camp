package hrms.hrms.dataAccess.abstracts;

import hrms.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    public void add(User user);
    public void delete(User user);
    public void update(User user);
}
