package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import models.Category;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilities.HibernateUtil;

/**
 *
 * @author VU NGUYEN HUONG
 */
public class CategoryRepository implements ICategoryRepository {

    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Transaction transaction = session.getTransaction();

    @Override
    public List<Category> getAll() {
        return session.createCriteria(Category.class).list();
    }

    @Override
    public List<Category> search(String ten) {
        List<Category> list = new ArrayList<>();
        Query query = session.createQuery("SELECT c FROM Category c WHERE c.ten LIKE :ten");
        query.setParameter("ten", "%" + ten + "%");
        list = query.getResultList();
        return list;
    }

    @Override
    public boolean save(Category category) {
        try {
            transaction.begin();
            session.saveOrUpdate(category);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Category category) {
        try {
            transaction.begin();
            session.delete(category);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Category getObj(String ma) {
        Category category = null;
        try {
            Query query = session.createQuery("SELECT c FROM Category c WHERE c.ma = :ma");
            query.setParameter("ma", ma);
            category = (Category) query.getSingleResult();
        } catch (Exception e) {
        }
        return category;
    }

}
