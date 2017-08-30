package com.tjz.crm.staff.dao;

import com.tjz.crm.base.BaseDao;
import com.tjz.crm.staff.domain.CrmStaff;

public interface StaffDao extends BaseDao<CrmStaff>{
	/**
	 * 通过用户名和密码查询
	 * @param loginName
	 * @param loginPwd
	 * @return
	 */
	public CrmStaff find(String loginName ,String loginPwd);

	
}
