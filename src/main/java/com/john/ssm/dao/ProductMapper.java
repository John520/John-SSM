package com.john.ssm.dao;

import com.john.ssm.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    Product findProductById(int id);
    List<Product> findAllProduct();
    void insertProduct(Product product);
}
