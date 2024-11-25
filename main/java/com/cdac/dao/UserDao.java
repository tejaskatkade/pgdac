package com.cdac.dao;

import java.sql.SQLException;
import java.util.List;

import com.cdac.pojo.User;

public interface UserDao{
	// validate
	public User validateUser(String email, String password) throws SQLException;
	
	// get
	public List<User> getAllUsers() throws SQLException;
	
	// post
	public String addUser(User user) throws SQLException;
	
	// put
	public String updatePassword() throws SQLException;
	
	// delete
	public String removeUser(int id) throws SQLException;
	public void cleanUp() throws SQLException;
}
