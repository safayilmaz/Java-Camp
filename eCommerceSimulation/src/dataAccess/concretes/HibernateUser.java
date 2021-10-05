package dataAccess.concretes;

import dataAccess.abstracts.IHibernateUserService;
import entities.concretes.User;

public class HibernateUser implements IHibernateUserService {
    @Override
    public void add(User user) {
        System.out.println(user.getName() + user.getSurname() + " is successfuly registered");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName() + user.getSurname() + " is successfuly deleted");
    }
}
