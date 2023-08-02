package org.cfx.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.cfx.domain.Product;
import org.cfx.service.IProductService;
import org.cfx.service.impl.ProductServiceImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author RTX 9090
 */
public class ProductServiceImplTest {

    IProductService productService = new ProductServiceImpl();
    @Test
    public void selectById() {
        System.out.println(productService.selectById(1L));
    }

    @Test
    public void selectAll() {
        List<Product> products = null;
        try {
            products = productService.selectAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
        products.forEach(System.out::println);
    }

    @Test
    public void insert() {
        productService.insert(new Product("键盘",3,10.0,"联想","联想",0.79,299));
    }

    @Test
    public void update() {
        productService.update(new Product(8L,"键盘113太",3,10.0,"联想","联想",0.79,299));
    }

    @Test
    public void delete(){
        productService.delete(9L);
    }

    @Test
    public void updateById(){
        productService.updateById(8L,9909);
    }
}

