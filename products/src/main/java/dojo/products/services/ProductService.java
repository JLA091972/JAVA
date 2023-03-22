package dojo.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dojo.products.models.Product;
import dojo.products.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getOneItem(Long id) {
        Optional<Product> oneproduct = productRepository.findById(id);
        Product product = oneproduct.orElse(null);
        return product;
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteItem(Product product) {
        productRepository.delete(product);
    }

}
