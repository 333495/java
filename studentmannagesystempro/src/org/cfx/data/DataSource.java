package org.cfx.data;

import org.cfx.entity.Admin;
import org.cfx.entity.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author RTX 9090
 */
public class DataSource {
    /**
     * 使用Map集合的LinkedHashMap装数据，有序
     */
    public static Map<String, Admin> admins = new LinkedHashMap<String, Admin>();
    public static Map<String, Student> students = new LinkedHashMap<String, Student>();


}
