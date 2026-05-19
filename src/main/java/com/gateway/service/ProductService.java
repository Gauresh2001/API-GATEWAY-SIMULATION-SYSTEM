package com.gateway.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gateway.entity.Product;
import com.gateway.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // GET ALL PRODUCTS
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    // GET PRODUCT BY ID
    public Product getProductById(Long id) {

        return productRepository.findById(id).orElse(null);
    }

    // SAVE PRODUCT
    public Product saveProduct(Product product) {

        return productRepository.save(product);
    }

    // UPDATE PRODUCT
    public Product updateProduct(Long id, Product product) {

        Product existingProduct =
                productRepository.findById(id).orElse(null);

        if (existingProduct != null) {

            existingProduct.setProductName(product.getProductName());
            existingProduct.setPrice(product.getPrice());

            return productRepository.save(existingProduct);
        }

        return null;
    }

    // DELETE PRODUCT
    public void deleteProduct(Long id) {

        productRepository.deleteById(id);
    }
}
