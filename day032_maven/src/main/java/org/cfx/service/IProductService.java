package org.cfx.service;


import org.cfx.domain.Product;

import java.io.IOException;
import java.util.List;

/**
 * @author RTX 9090
 */
public interface IProductService {
    void insert(Product product);
    void update(Product product);
    void delete(long id);
    Product selectById(Long id);
    List<Product> selectAll() throws IOException;
    void updateById(long id,double salePrice);
}
