package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import models.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilities.HibernateUtil;

/**
 *
 * @author VU NGUYEN HUONG
 */
public class UsersRepository implements IUsersRepository {

    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Transaction transaction = session.getTransaction();
    private List<Users> list;

    @Override
    public List<Users> getAll() {
        list = new ArrayList<>();
        Query query = session.createQuery("SELECT u FROM Users u");
        list = query.getResultList();
        return list;
    }

    @Override
    public List<Users> search(String text) {
        list = new ArrayList<>();
        Query query = session.createQuery("SELECT u FROM Users u WHERE u.ma LIKE :ma");
        query.setParameter("ma", "%" + text + "%");
        list = query.getResultList();
        return list;
    }

}
