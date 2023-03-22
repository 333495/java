/**
 * 狗类
 */
public class Dog {
    /** 名字 */
    String dogName;
    /** 年龄 */
    boolean dogSex;

    //有参构造器
    public Dog(String name,boolean sex){
        this.dogName = name;
        this.dogSex = sex;
        eat1("大香肠");
//        System.out.println("一个名字叫" + name + "的" + (dogSex ? "公":"母") + "狗");
    }

    //无参构造器
    public Dog(){

    }

    //定义一个吃的方法 1
    public void eat(String food){
        System.out.println("正在吃" + food + "中.....");
    }

    //定义一个吃的方法 2
    public void eat1(String food){
        String relSex = dogSex == false ? "母" : "公";
        System.out.println("一个名字为：" + dogName + "的" + relSex + "狗" + "正在吃" + food);
    }
}
