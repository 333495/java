package org.cfx.commonclass.random01;

import java.util.Arrays;
import java.util.UUID;

/**
 * @author RTX 9090
 */
public class UUID01 {
    public static void main(String[] args) {
        // Create UUID 唯一的
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
        System.out.println("================================================");
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
    }
}
