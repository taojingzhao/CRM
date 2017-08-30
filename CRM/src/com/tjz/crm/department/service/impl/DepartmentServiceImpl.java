package com.tjz.crm.department.service.impl;

import java.util.List;

import com.tjz.crm.department.dao.DepartmentDao;
import com.tjz.crm.department.domain.CrmDepartment;
import com.tjz.crm.department.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentDao departmentDao;
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	@Override
	public List<CrmDepartment> findAll() {
		return departmentDao.findAll();
	}

}
