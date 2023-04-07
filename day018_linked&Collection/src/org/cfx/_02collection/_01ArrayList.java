package org.cfx._02collection;

import java.util.ArrayList;

/**
 * @author RTX 9090
 */
public class _01ArrayList {
    public static void main(String[] args) {
        // 创建ArrayList对象
        ArrayList objects = new ArrayList();
        User user = new User();
        user.setName("RTXxx","123456");
        // 添加元素
        objects.add(user);
        objects.add("1111");
        objects.add(223);
        objects.add('a');
        objects.add("何亮");
        // 插入元素
        objects.add(1,"09890");

        objects.set(0,2.3);
    }

}
