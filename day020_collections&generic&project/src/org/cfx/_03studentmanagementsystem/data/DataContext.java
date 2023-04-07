package org.cfx._03studentmanagementsystem.data;

import org.cfx._03studentmanagementsystem.entity.Admin;
import org.cfx._03studentmanagementsystem.entity.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author RTX 9090
 */
public class DataContext {
    /**
        管理员数据
     */
    public static Map<String, Admin> admins = new LinkedHashMap<String, Admin>();
    /**
        学生数据
     */
    public static HashMap<String, Student> students = new LinkedHashMap<String, Student>();
}
