package com.tjz.crm.post.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tjz.crm.department.domain.CrmDepartment;
import com.tjz.crm.post.dao.PostDao;
import com.tjz.crm.post.domain.CrmPost;

public class PostDaoImpl extends HibernateDaoSupport implements PostDao {

	@Override
	public List<CrmPost> findAll(CrmDepartment department) {
		return this.getHibernateTemplate().find("from CrmPost where department = ?", department);
	}

}
