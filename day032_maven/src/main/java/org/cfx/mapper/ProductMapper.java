package org.cfx.mapper;

import org.cfx.domain.Product;

import java.util.List;

/**
 * @author RTX 9090
 */
public interface ProductMapper {
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

//    Product updateById(long id,double salePrice);

    /**
     * 删
     * @param id 产品id
     */
    int deleteById(long id);

    /**
     * 根据id查产品
     * @param id 产品id
     * @return 返回产品对象
     */
    Product getById(Long id);

    /**
     * 查询全部产品
     * @return 返回对象集合
     */
    List<Product> selectAll();
}
