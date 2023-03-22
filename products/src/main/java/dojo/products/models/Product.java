package dojo.products.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product Name is required!")
    @Size(min = 3, max = 30, message = "Must be between 3 and 30 characters")
    private String productname;
    
    @NotBlank(message = "Product Description is required!")
    @Size(min = 3, max = 30, message = "Must be between 3 and 30 characters")
    private String productdescription;

    @NotNull(message = "PRICE is required!")
    @Min(value = 0, message = "Price cannot be 0")
    private double price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "categories_products", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", productname='" + getProductname() + "'" +
            ", productdescription='" + getProductdescription() + "'" +
            ", price='" + getPrice() + "'" +
            ", categories='" + getCategories() + "'" +
            "}";
    }


    public Product() {
    }


    public Product(Long id, String productname, String productdescription, double price, List<Category> categories) {
        this.id = id;
        this.productname = productname;
        this.productdescription = productdescription;
        this.price = price;
        this.categories = categories;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductname() {
        return this.productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdescription() {
        return this.productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}
