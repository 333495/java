/**
 * 值传递 引用传递
 */
public class Method02 {
    //基本数据不影响原来的值
    public static void main(String[] args) {
        int a = 6;
        System.out.println("改变前：" +a);//6
        change(a);
        System.out.println("改变后："+a);//6


        System.out.println("==========================================");


        int c = 10;
        System.out.println("改变前：" +c);//10
        change1(c);
        System.out.println("改变后：" + c);//10
    }

    public static void change(int a){
        a = 10;
        System.out.println("改变中：" +a);//10
    }

    public static void change1(int c){
        c = 1000;
        System.out.println("改变中：" + c);//1000
    }
}
