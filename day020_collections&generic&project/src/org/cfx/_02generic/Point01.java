package org.cfx._02generic;

/**
 * @author RTX 9090
 * 设计一个类来表示俄罗斯方块
 */
public class Point01 {
    int x;
    int y;
}

/**
 * 设计一个 类 用来表示 飞机大战的坐标
 */
class Point02{

}
/**
 * 设计一个 类 用来表示 一栋楼中房子的坐标
 */
class Point03{
    String x;
    String y;
}
/**
 * 语法
  */

class Point<T> {    // 表示在类声明了一个符号  数据类型，是一种泛指
    T x;
    T y;

    public Point(T x,T y) {    // 表示在类声明了一个符号  数据类型，是一种泛指
        this.x =  x;
        this.y =  y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class PointTest {
    public static void main(String[] args) {
        // 泛型的类型不能是简单类型 必须是 引用数据类型
        Point<Integer> d = new Point<>(4,5);
        Point<Double> e = new Point<>(4.0,5.0);
        Point<String> f = new Point<>("4","5");

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
