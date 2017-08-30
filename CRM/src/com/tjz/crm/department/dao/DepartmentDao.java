package com.tjz.crm.department.dao;

import com.tjz.crm.department.domain.CrmDepartment;

import java.util.List;

public interface DepartmentDao {
	
	/**
	 * 查询所有部门
	 * @return
	 */
	public List<CrmDepartment> findAll();

}
