package repositories;

import java.util.List;
import models.Category;

/**
 *
 * @author VU NGUYEN HUONG
 */
public interface ICategoryRepository {

    List<Category> getAll();

    List<Category> search(String ten);

    boolean save(Category category);

    boolean delete(Category category);

    Category getObj(String ma);
}
