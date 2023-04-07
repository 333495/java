package org.cfx._02generic;

import org.cfx.Book;
import org.cfx.User;

import java.util.ArrayList;

/**
 * @author RTX 9090
 */
public class _01GenericTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();


        // 书包里面就放书 -- 做限定   泛型 做安全性 强制限定==
        // 所有的强制转换都是 隐式的 和自动的
        // 提高代码重用率
    }
}
