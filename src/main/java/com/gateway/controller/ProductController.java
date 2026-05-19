package com.gateway.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gateway.entity.Product;
import com.gateway.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET ALL PRODUCTS
    @GetMapping
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    // GET PRODUCT BY ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {

        return productService.getProductById(id);
    }

    // SAVE PRODUCT
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {

        return productService.saveProduct(product);
    }

    // UPDATE PRODUCT
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,
                                 @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }

    // DELETE PRODUCT
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {

        productService.deleteProduct(id);

        return "Product Deleted Successfully";
    }
}
