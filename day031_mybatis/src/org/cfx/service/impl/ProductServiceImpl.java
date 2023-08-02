package org.cfx.service.impl;

import org.cfx.dao.IProductDao;
import org.cfx.dao.impl.ProductDaoImpl;
import org.cfx.domain.Product;
import org.cfx.service.IProductService;

import java.io.IOException;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    IProductDao productDao = new ProductDaoImpl();
    @Override
    public void insert(Product product) {
        productDao.insert(product);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }

    @Override
    public void delete(long id) {
        int delete = productDao.delete(id);
        if (delete != 0){
            System.out.println("Product deleted");
        }else {
            System.out.println("Product not deleted");
        }
    }

    @Override
    public Product selectById(Long id) {
        return productDao.selectById(id);
    }

    @Override
    public List<Product> selectAll() {
        return productDao.selectAll();
    }

    @Override
    public void updateById(long id, double salePrice) {
        Product product = productDao.updateById(id, salePrice);
        if (product != null){
            product.setSalePrice(salePrice);
            productDao.update(product);
            System.out.println("成功修改！");
        }else {
            System.out.println("未修改！");
        }
    }
}
