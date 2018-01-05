package com.wcxu.listShow.dao;

import java.util.List;

import com.wcxu.listShow.entity.User;

public interface UserDao {

	public List<User> findAll() throws Exception;

}
