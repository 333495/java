/**
 * 调方法
 */
public class MethodTest01 {
    public static void main(String[] args) {
        System.out.println("=========静态方法调用静态方法========");
        MethodTest01.test();// 静态方法调用可以直接调用test();
        test();//省掉类名
        System.out.println("=========静态方法调用非静态方法========");

        MethodTest01 mm = new MethodTest01();
        mm.test2();//静态方法调非静态方法时，要用对象名.方法名
        mm.test1();//

    }

    public static void test(){
        System.out.println("静态方法！😊😊😊😊😊😊🤣🤣🤣🤣🤣🤣");
    }

    public void test1(){
        System.out.println("=========非静态方法调用非静态方法========");
        test2();//非静态方法调用：在同一个类中可以直接调用，省掉类名 也可以
        MethodTest01 m = new MethodTest01();
        m.test2();//也可以创建对象进行调用
        System.out.println("非静态方法！");
    }
    public void test2(){
        System.out.println("=========非静态方法调用静态方法========");
        test();
        MethodTest01.test();//静态方法调用：类名.方法名  也可以直接调用省掉类名
        System.out.println("111111你调用了非静态方法！");
    }
}
