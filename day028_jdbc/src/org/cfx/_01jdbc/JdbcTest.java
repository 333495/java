package org.cfx._01jdbc;

import org.junit.Test;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author RTX 9090
 */
public class JdbcTest {

    public static String url = "jdbc:mysql://localhost:3306/db1?serverTimezone=Asia/Shanghai&useSSL=false&characterEncoding=UTF-8&allowPublicKeyRetrieval=true";
    public static String username = "root";
    public static String password = "cfx2000";
    @Test
    public void test01(){
        System.out.println("Testing");
    }

    @Test
    public void testQueryOne() throws Exception {
        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 连接
        Connection conn = DriverManager.getConnection(url,username,password);
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery("SELECT * FROM db1.t_user");
        while (res.next()) {
            long id = res.getLong("id");
            String name = res.getString("name");
            int age = res.getInt("age");
            int sex = res.getInt("sex");

            System.out.println(new User(id,name, age, sex));
        }
        res.close();
        st.close();
        conn.close();
    }
}
