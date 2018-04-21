package com.john.ssm.dao;

import com.john.ssm.bean.Product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@MapperScan
@Repository
public interface ProductMapper {
    Product findProductById(int id);
}
