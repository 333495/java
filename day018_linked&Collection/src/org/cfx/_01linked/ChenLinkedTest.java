package org.cfx._01linked;

/**
 * @author RTX 9090
 */
public class ChenLinkedTest {
    public static void main(String[] args) {
        ChenLinked chenLinked1 = new ChenLinked("1111");
        ChenLinked chenLinked2 = new ChenLinked();
        ChenLinked chenLinked3 = new ChenLinked(new User());
        ChenLinked chenLinked4 = new ChenLinked(new User("陈"));

        System.out.println(chenLinked4);

    }

}