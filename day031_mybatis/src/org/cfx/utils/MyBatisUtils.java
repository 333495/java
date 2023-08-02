package org.cfx.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author RTX 9090
 */
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;

    //初始化SqlSessionFactory
    static {
        try{
            //1.准备配置文件
            String resource = "mybatis-config.xml";
            //2.加载配置文件
            Reader reader = Resources.getResourceAsReader(resource);
            //3.创建SqlSessionFactory 工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取SqlSession
    public static SqlSession openSession(){
        if(sqlSessionFactory == null){
            throw new NullPointerException("对不起，丁真异常咯！");
        }
        //创建SQL会话对象
        return sqlSessionFactory.openSession();
    }
}
