package org.cfx._02curd.utils;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author RTX 9090
 */
public class JdbcUtil {

    private static String driver;
    private static String url;
    private static String username;
    private static String password;


    static {
        Properties properties = new Properties();
        try {
            properties.load(JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = properties.getProperty("jdbc.driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        try {
            //加载驱动  "贾"
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){

        // 获取连接  "连"
        try {
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(ResultSet rs, Statement st, Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
