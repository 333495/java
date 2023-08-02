package org.cfx.homework.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author RTX 9090
 */
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Teacher {
    private long teacherId;
    private String teacherName;
        private String subjectName;

    @Override
    public String toString() {
        return "教师信息{" +
                "教师编号=" + teacherId +
                ", 教师姓名='" + teacherName + '\'' +
                ", 所属科目='" + subjectName + '\'' +
                '}';
    }
}
