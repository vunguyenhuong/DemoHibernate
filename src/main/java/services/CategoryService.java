package services;

import java.util.List;
import models.Category;
import repositories.CategoryRepository;
import repositories.ICategoryRepository;

/**
 *
 * @author VU NGUYEN HUONG
 */
public class CategoryService implements ICategoryService {

    private ICategoryRepository repo;

    public CategoryService() {
        repo = new CategoryRepository();
    }

    @Override
    public List<Category> getAll() {
        return repo.getAll();
    }

    @Override
    public List<Category> search(String ten) {
        return repo.search(ten);
    }

    @Override
    public boolean save(Category category) {
        return repo.save(category);
    }

    @Override
    public boolean delete(Category category) {
        return repo.delete(category);
    }

    @Override
    public Category getObj(String ma) {
        return repo.getObj(ma);
    }

}
