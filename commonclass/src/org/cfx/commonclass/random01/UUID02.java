package org.cfx.commonclass.random01;

import java.util.UUID;

/**
 * @author RTX 9090
 */
public class UUID02 {
    public static void main(String[] args) {
        //获取唯一的UUID
        System.out.println(UUID.randomUUID());
        String random = UUID.randomUUID().toString();
        System.out.println(random.replace("-", ""));
    }
}
