
/**
 * 学生测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建学生对象
        Student student = new Student();
        //赋值
        student.stuName = "张三";
        student.stuAge = 23;
        student.gender = true;
        //取值
        System.out.println(student.stuName);
        System.out.println(student.gender ? "男" : "女");
        System.out.println(student.stuAge);
        //调玩耍，学习
        student.study();
        student.play("王者荣耀");
        System.out.println("=================测试===============");
        student.setStuName("小王");
        student.setStuAge(23);
        student.setGender(true);
        System.out.println(student.getStuName());
        System.out.println(student.getStuAge());
        System.out.println(student.isGender() ? "男" : "女");
        student.play("英雄联盟");

    }
}