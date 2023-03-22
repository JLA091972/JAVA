package dojo.prodandcat.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dojo.prodandcat.models.Category;
import dojo.prodandcat.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findAll();
    Product findByIdIs(Long id);
    List<Product> findAllByCategories(Category category);
    List<Product> findByCategoriesNotContains(Category category);
}
