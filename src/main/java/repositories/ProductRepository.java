package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import models.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilities.HibernateUtil;

/**
 *
 * @author VU NGUYEN HUONG
 */
public class ProductRepository implements IProductRepository {

    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Transaction transaction = session.getTransaction();

    @Override
    public List<Product> getAll() {
        return session.createCriteria(Product.class).list();
    }

    @Override
    public List<Product> search(String ten) {
        List<Product> list = new ArrayList<>();
        Query query = session.createQuery("SELECT c FROM Product c WHERE c.ten LIKE :ten");
        query.setParameter("ten", "%" + ten + "%");
        list = query.getResultList();
        return list;
    }

    @Override
    public boolean save(Product product) {
        try {
            transaction.begin();
            session.saveOrUpdate(product);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Product product) {
        try {
            transaction.begin();
            session.delete(product);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Product getObj(String ma) {
        Product product = null;
        try {
            Query query = session.createQuery("SELECT c FROM Product c WHERE c.ma = :ma");
            query.setParameter("ma", ma);
            product = (Product) query.getSingleResult();
        } catch (Exception e) {
        }
        return product;
    }

}
