package com.leverx.actuator.springbootactuator.service;

import com.leverx.actuator.springbootactuator.pojo.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ProductService {

    Product createProduct(Product product);
    List<Product> getProductList();
    Product getProductById(Long id);
    void deleteProductById(Long id);
}
