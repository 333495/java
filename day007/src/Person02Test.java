/**
 * 测试类
 */
public class Person02Test {
    public static void main(String[] args) {
        Person02 test = new Person02();
        test.name = "John111111111111111111111111111";
        test.age = 100;
        test.address = "傻逼省";
        test.gender = false;

        System.out.println(test.name);
        System.out.println(test.age);
        System.out.println(test.gender ? "男" : "女");
        System.out.println(test.address);
        test.eat("火腿");
        test.speak();

        //定义
        String str = "John cont";
        String str1 = "job name";
        System.out.println(str.endsWith("cont"));
        System.out.println(str.startsWith("cont"));
        System.out.println(str.equals(str1));
        String str2 = "12w21wadqwdwd";
        System.out.println(str2.substring(3, 8));

    }

}