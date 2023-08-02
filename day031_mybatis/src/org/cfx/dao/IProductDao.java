package org.cfx.dao;

import org.cfx.domain.Product;

import java.io.IOException;
import java.util.List;

/**
 * @author RTX 9090
 */
public interface IProductDao {
    /**
     * 增
     * @param product 产品
     */
    void insert(Product product);

    /**
     * 改
     * @param product 产品
     */
    void update(Product product);

    Product updateById(long id,double salePrice);

    /**
     * 删
     * @param id 产品id
     */
    int delete(long id);

    /**
     * 根据id查产品
     * @param id 产品id
     * @return 返回产品对象
     */
    Product selectById(Long id);

    /**
     * 查询全部产品
     * @return 返回对象集合
     */
    List<Product> selectAll();
}
