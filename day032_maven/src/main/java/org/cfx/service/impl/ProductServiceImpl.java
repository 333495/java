package org.cfx.service.impl;


import org.cfx.domain.Product;
import org.cfx.mapper.ProductMapper;
import org.cfx.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * @author RTX 9090
 */
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void insert(Product product) {
        productMapper.insert(product);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }

    @Override
    public void delete(long id) {
        productMapper.deleteById(id);
    }

    @Override
    public Product selectById(Long id) {
        System.out.println(productMapper);
        return productMapper.getById(id);
    }

    @Override
    public List<Product> selectAll() throws IOException {
        return productMapper.selectAll();
    }

    @Override
    public void updateById(long id, double salePrice) {
        Product byId = productMapper.getById(id);
        if (byId != null){
            byId.setSalePrice(salePrice);
            productMapper.update(byId);
        }
    }
}
