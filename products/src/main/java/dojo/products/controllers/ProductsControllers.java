package dojo.products.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import dojo.products.models.Product;
import dojo.products.services.ProductService;

@Controller
public class ProductsControllers {
    @Autowired
    ProductService productService;

    // Create/Add a product
    @GetMapping("/products/new")
    public String createProduct(@ModelAttribute("product") Product product, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        return "products/newproduct.jsp";
    }

    @PostMapping("/addproduct") // should be the same on the form action!!
    public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult results, Model model) {
        if (results.hasErrors()) {
            return "products/newproduct.jsp";
        } else {
            List<Product> products = productService.getAllProducts();
            model.addAttribute("products", products);
            return "redirect:/produ";
        }
    }

    // Read ALL
    @GetMapping("/products")
    public String products(Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        System.out.println(products);
        return "products/products.jsp";
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Product> products = productService.allProducts();
        // List<Category> categories = categoryService.allCategories();
        model.addAttribute("products", products);
        model.addAttribute("categories", categories);
        return "index.jsp";
    }

    // Read One
    @GetMapping("/products/{id}")
    public String showOne(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        Product product = productService.getOneItem(id);
        model.addAttribute("product", product);
        return "products/showaproduct.jsp";
    }

    // Update
    @GetMapping("/products/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        Product product = productService.getOneItem(id);
        model.addAttribute("product", product);
        System.out.println(product);
        return "products/edit.jsp";
    }

    @PutMapping("/products/{id}/update")
    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("product") Product product, BindingResult results) {
        System.out.println(product);
        if (results.hasErrors()) {
            return "products/edit.jsp";
        } else {
            System.out.println(product);
            productService.updateProduct(product);
            return "redirect:/products";
        }
    }

    // Delete
    @DeleteMapping("/products/{id}")
    public String remove(@PathVariable("id") Long id) {
        Product product = productService.getOneItem(id);
        productService.deleteItem(product);
        return "redirect:/products";
    }

}
