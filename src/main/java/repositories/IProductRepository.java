package repositories;

import java.util.List;
import models.Product;

/**
 *
 * @author VU NGUYEN HUONG
 */
public interface IProductRepository {

    List<Product> getAll();

    List<Product> search(String ten);

    boolean save(Product product);

    boolean delete(Product product);

    Product getObj(String ma);
}
