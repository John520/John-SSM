package com.john.ssm.configtest;

import com.john.ssm.bean.Product;
import com.john.ssm.config.RootConfig;
import com.john.ssm.dao.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
public class TestDataSource {
    @Autowired
    DataSource ds;
    @Autowired
    ProductMapper productMapper;
    @Test
    public void testDataSource() throws SQLException {

        System.out.println(ds);
        System.out.println(ds.getConnection());
    }

    @Test
    public void testProductMapper() throws SQLException {
       Product p= productMapper.findProductById(1);
       System.out.println(p);
    }
}
