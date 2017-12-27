package com.mybatis.dao;

import com.mybatis.bean.Employee;

public interface EmployeeMapper {
	public Employee getEmpById(Integer id);
}
