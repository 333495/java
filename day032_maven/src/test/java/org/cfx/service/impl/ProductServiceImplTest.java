package org.cfx.service.impl;

import org.cfx.service.IProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import static org.junit.Assert.*;

public class ProductServiceImplTest {

    @Autowired
    IProductService productService = new ProductServiceImpl();
    @Test
    public void test01(){
        System.out.println(productService.selectById(9L));
    }

    @Test
    public void test02(){
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            try {
                System.out.println(localHost.isReachable(2000));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

}