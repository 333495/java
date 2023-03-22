package org.cfx.abstracttest;

/**
 * @author RTX 9090
 */
public class AstraGraphTest {
    public static void main(String[] args) {
        Cricle test = new Cricle();
        test.setR(89);
        System.out.println("圆的面积："+test.getAreas());

        Rectangle rectangle = new Rectangle(12,23);
        System.out.println("长方形的面积为："+rectangle.getAreas());
    }
}