package org.cfx.utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author RTX 9090
 */
public class JDBCUtils {

    //定义一些字段，用户简化代码
    private static String driver;
    private static String url;
    private static String username;
    private static String password;


    static {
        Properties properties = new Properties();
        try {
            //加载db.properties文件
            properties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //从db.properties取值。给字段复制
        driver = properties.getProperty("jdbc.driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        try {
            //加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            //连接
//            return DriverManager.getConnection(url, username, password);
            // 配置HikariConfig参数
            HikariConfig hikariConfig = new HikariConfig();
            hikariConfig.setDriverClassName(driver);
            hikariConfig.setJdbcUrl(url);
            hikariConfig.setUsername(username);
            hikariConfig.setPassword(password);
            //准备好缓存语句
//            hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
            //准备缓存的大小
//            hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
            //最大缓存sql条数
//            hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
            // 创建连接池HikariDataSource对象
            HikariDataSource dataSource = new HikariDataSource(hikariConfig);
            //获取连接
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    //抽取出释放资源的代码
    public static void close(ResultSet rs, Statement st, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
