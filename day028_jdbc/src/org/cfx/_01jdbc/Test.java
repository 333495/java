package org.cfx._01jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author RTX 9090
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //加载驱动  "贾"
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 获取连接  "连"
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=Asia/Shanghai&useSSL=false&characterEncoding=UTF-8&allowPublicKeyRetrieval=true","root","cfx2000");
        System.out.println(connection);
        // 获取语句对象  "欲"
        Statement statement = connection.createStatement();
        // 执行SQL语句  "执"
        statement.execute("select * from product");
        //关流  "释"
        statement.close();
        connection.close();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=Asia/Shanghai&useSSL=false&characterEncoding=UTF-8&allowPublicKeyRetrieval=true","root","cfx2000");
        Statement statement1 = connection1.createStatement();
        statement1.executeQuery("select * from product");
    }
}
