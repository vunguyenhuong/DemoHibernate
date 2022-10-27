package services;

import java.util.List;
import models.Product;
import repositories.IProductRepository;
import repositories.ProductRepository;

/**
 *
 * @author VU NGUYEN HUONG
 */
public class ProductService implements IProductService {

    private IProductRepository repo;

    public ProductService() {
        repo = new ProductRepository();
    }

    @Override
    public List<Product> getAll() {
        return repo.getAll();
    }

    @Override
    public List<Product> search(String ten) {
        return repo.search(ten);
    }

    @Override
    public boolean save(Product product) {
        return repo.save(product);
    }

    @Override
    public boolean delete(Product product) {
        return repo.delete(product);
    }

    @Override
    public Product getObj(String ma) {
        return repo.getObj(ma);
    }

}
