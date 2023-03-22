package org.cfx.extends02;

import java.util.Objects;

/**
 * @author Rtx
 * 动物类
 */
public class Animal {
    private String name;
    String weight;
    String color;
    static String sex;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getSex() {
        return sex;
    }

    public static void setSex(String sex) {
        Animal.sex = sex;
    }
    
}
