package com.tjz.crm.post.service.impl;

import java.util.List;

import com.tjz.crm.department.domain.CrmDepartment;
import com.tjz.crm.post.dao.PostDao;
import com.tjz.crm.post.domain.CrmPost;
import com.tjz.crm.post.service.PostService;

public class PostServiceImpl implements PostService {
	private PostDao postDao;
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	@Override
	public List<CrmPost> findAll(CrmDepartment department) {
		return postDao.findAll(department);
	}

}
