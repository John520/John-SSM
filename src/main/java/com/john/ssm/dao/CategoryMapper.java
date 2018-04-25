package com.john.ssm.dao;

import com.john.ssm.bean.Category;
import com.john.ssm.bean.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMapper {
    Category findCategoryById(int id);


}
