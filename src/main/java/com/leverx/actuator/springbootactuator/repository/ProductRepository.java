package com.leverx.actuator.springbootactuator.repository;
import com.leverx.actuator.springbootactuator.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
