package com.leverx.actuator.springbootactuator.service.Impl;

import com.leverx.actuator.springbootactuator.exceptions.ProductNotFoundException;
import com.leverx.actuator.springbootactuator.pojo.Product;
import com.leverx.actuator.springbootactuator.repository.ProductRepository;
import com.leverx.actuator.springbootactuator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(()
                        -> new ProductNotFoundException("Product with id " + id + " not found"));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
