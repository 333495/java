package org.cfx.dao.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.cfx.dao.IProductDao;
import org.cfx.domain.Product;
import org.cfx.utils.MyBatisUtils;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author RTX 9090
 */
public class ProductDaoImpl implements IProductDao {
    private static final String NAME_SPACE = "org.cfx.mapper.ProductMapper.";
    private static Logger logger = Logger.getLogger(ProductDaoImpl.class);


    //根据id查产品
    @Override
    public Product selectById(Long id) {
        logger.info("查询传入的id："+id);
        Product product = null;
        // 取得连接
        SqlSession sqlSession = MyBatisUtils.openSession();
        try {
            //执行
            product = sqlSession.selectOne(NAME_SPACE + "getById", id);
            sqlSession.commit();
        }catch (Exception e) {
            // 发生异常回滚
            sqlSession.rollback();
        }finally {
            //关闭sql会话
            sqlSession.close();
        }
        return product;
    }

    //修改
    @Override
    public void update(Product product) {
        logger.info("修改的入参为："+product);
        SqlSession sqlSession = MyBatisUtils.openSession();
        try {
            sqlSession.update(NAME_SPACE + "update", product);
            sqlSession.commit();
        }catch (Exception e) {
            System.out.println("发生异常，未进行任何修改！");
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
    }

    @Override
    public Product updateById(long id, double salePrice) {
        logger.info("修改传入的参数是："+id+"，"+salePrice);
        SqlSession sqlSession = MyBatisUtils.openSession();
        try{
            return sqlSession.selectOne(NAME_SPACE + "getById", id);
        }catch (Exception e){
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }
        return null;
    }

    //新增
    @Override
    public void insert(Product product) {
        logger.info("新增的入参为："+product);
        //取得连接
        SqlSession sqlSession = MyBatisUtils.openSession();
        //执行sql
        sqlSession.insert(NAME_SPACE + "insert", product);
        sqlSession.commit();
        sqlSession.close();

    }

    //删除
    @Override
    public int delete(long id) {
        SqlSession sqlSession = MyBatisUtils.openSession();
        try {
            int delete = sqlSession.delete(NAME_SPACE + "deleteById", id);
            sqlSession.commit();
            return delete;
        }catch (Exception e) {
            sqlSession.rollback();
            return 0;
        }finally {
            sqlSession.close();
        }
    }



    //查询所有产品
    @Override
    public List<Product> selectAll(){
        //1.准备配置文件
        String resource = "mybatis-config.xml";
        //2.加载配置文件
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //3.创建SqlSessionFactory 工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //4.创建SQL会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //6.执行SQL
        List<Product> products = sqlSession.selectList(NAME_SPACE+"selectAll");
        //7.关闭资源
        sqlSession.close();
        //8.返回products
        return products;

    }
}
