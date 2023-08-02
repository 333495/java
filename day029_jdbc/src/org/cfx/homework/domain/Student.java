package org.cfx.homework.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RTX 9090
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    private long stuId;
    private String name;
    private int sex;
    private int selectedTeacherId;

    /**
     *
     关联属性通过教师id查询
     */
    private List<Teacher>  teachers = new ArrayList<>();

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", teachers=" + teachers +
                '}';
    }

    public Student(long stuId, String name, int sex) {
        this.stuId = stuId;
        this.name = name;
        this.sex = sex;
    }
}
