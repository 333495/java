package org.cfx._01mapper.mapper;

import org.cfx._01mapper.domain.Employee;

import java.util.List;

/**
 * @author RTX 9090
 * 一般情况下，一个实体类对应一个mapper
 * 这个mapper接口不用我们自己实现
 * xml的包路径要mapper一一对应
 */
public interface EmployeeMapper {
    /**
     * 查询所有员工
     * @return 返回所有员工
     */
    List<Employee> getAll();

    Employee getById(long id);

    void insert(Employee employee);

    void update(Employee employee);

    void remove(long id);
}
