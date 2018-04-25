package com.john.ssm.configtest;

import com.john.ssm.bean.Category;
import com.john.ssm.bean.Product;
import com.john.ssm.config.RootConfig;
import com.john.ssm.dao.CategoryMapper;
import com.john.ssm.dao.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestDataSource {
    @Autowired
    DataSource ds;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Test
    public void testDataSource() throws SQLException {

        System.out.println(ds);
        System.out.println(ds.getConnection());
    }

    @Test
    public void testFindProductById() throws SQLException {
       Product p= productMapper.findProductById(1);
       System.out.println(p);
    }
    @Test
    public void testFindAllProduct() throws SQLException {
        List<Product> p= productMapper.findAllProduct();
        System.out.println(p);
    }
    @Test
    public void testInsert() throws SQLException {
        Product p=new Product();
        p.setName("nnn");
        productMapper.insertProduct(p);
        System.out.println(p);
    }
    @Test
    public void testCategoryMapper() throws SQLException {
        Category c= categoryMapper.findCategoryById(1);
        System.out.println(c);
    }
}
