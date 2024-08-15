package com.ecommerce.util;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * DataLoader class to preload data into the repository on application startup.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() < 1) {
            Product product = new Product();
            product.setName("Boba pearls");
            product.setDescription("Boba pearls");
            product.setPrice(BigDecimal.valueOf(10));

            productRepository.save(product);
        }
    }
}
