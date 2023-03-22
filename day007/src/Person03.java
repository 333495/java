/**
 * 人类
 */
public class Person03 {
    /** 姓名  */
    String name;
    /** 年龄  */
    int age;
    /** 性别  */
    boolean gender;
    /** 地址  */
    String address;

    public void speak(){
        System.out.println("说话");
    }
    public void eat(String food){
        System.out.println("吃"+ food +"了");
    }

    //无参构造器
    public Person03(){
        name = "John123";
        age = 23;
        address = "成都";
    }

    //有参构造器
    public Person03(String n, int a, String ad){
        name = n;
        age = a;
        address = ad;
    }

}
