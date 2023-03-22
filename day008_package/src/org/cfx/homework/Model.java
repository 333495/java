package org.cfx.homework;

/*
    1. 定义一个Model类，里面有姓名、性别、年龄、胸围、腰围 字段，请使用标准封装+this进行测试；
	建议：写上this(...)的使用    先手打在快捷键

 */
public class Model {
    private String name;
    private boolean gender;
    private int age;
    private double bust;
    private double waistline;

    //无参
    public Model(){

    }
    public Model(String name){
        this("李四",false,23);//必须在第一行
    }


    public Model(String name, boolean gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //set方法
    public void setName(String name){
        this.name = name;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setBust(double bust){
        this.bust = bust;
    }
    public void setWaistline(double waistline){
        this.waistline = waistline;
    }
    //get方法
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBust(){
        return bust;
    }

    public double getWaistline(){
        return waistline;
    }

    public boolean isGender(){
        return gender;
    }
}
