/**
 * 学生类
 */
public class Student {
    /** 姓名 */
    String stuName;
    /** 年龄 */
    int stuAge;
    /** 性别 */
    boolean gender;

    public void study(){
        System.out.println("学习.....");
    }
    public void play(String game){
        System.out.println("下课玩耍" + game);
    }
    //无参
    public Student(){}

    /* get and set */
    public void setStuName(String name){
        this.stuName = name;
    }
    public void setStuAge(int age){
        this.stuAge = age;
    }

    public String getStuName() {
        return stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
