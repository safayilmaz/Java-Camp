package dataAccess.abstracts;

import entities.concretes.User;

public interface IHibernateUserService {
    void add(User user);
    void delete(User user);

}
