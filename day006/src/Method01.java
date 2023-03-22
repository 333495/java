import static javafx.scene.input.KeyCode.M;

/**
 * 方法  一段独立的代码，能完成一个功能。
 */
public class Method01 {
    public static void main(String[] args) {
        //求两个数的和
        Method01.sum(1,8);// . 表示从属关系
        Method01.sum(9,9);// 实参
        System.out.println("====================");
        //求三个数的乘积
        Method01 m = new Method01();
        int dd = m.multip(2,3,2);
        System.out.println(dd);
        System.out.println("==================");
        //求两个数的平均值
        Method01 mm = new Method01();
        double cc = mm.avg(1,2);
        System.out.println(cc);
        System.out.println("=========静态方法调用静态方法========");
        MethodTest01.test();
    }
    //1. copy main方法
    /**
        在同一个类中 不能有存在2个相同的方法签名(可以有相同的方法名，但是他们的参数个数、参数类型、参数顺序不同。)
        public ： 关键字 叫修饰符 非必须的
        static ： 关键字 叫修饰符 非必须
        void ： 关键字 返回值类型 没有返回值 那么就是voic 如果有那就是返回值类型
        main ： 方法名 自己取名字（根据标识符规范）
        () ： 用于定义方法  方法必须要有括号
        String[] args ： 形参列表 可以有一个或多个 就是变量 没有就不写
                        String[] ： 参数类型
                        args ： 参数名字
        { } : 方法体

    */

    //方法名小驼峰
    public static void sum(int a, int b){//形参
        System.out.println(a + b);
    }
    public static void sum(int a){//可以存在2个相同的方法名但是形参列表不同
        System.out.println(a);
    }
    //三个数的乘积
    public int multip(int a, int b, int c){
//        MethodTest01 mmm = new MethodTest01();
//        mmm.test1();//不同类中，非静态方法调用非静态方法
//        MethodTest01.test();//不同类中,非静态方法调用静态方法
        int d = a * b * c;
        return d;

    }
    //两个数的平均值
    public double avg(double a ,double b){
        double c = (a + b) / 2;
        return c;
    }
}
