package com.cdac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.cdac.util.DBUtils.getConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.pojo.User;

public class UserDaoImpl implements UserDao{

	private Connection connection;
	private PreparedStatement pst1, pst2,pst3,pst4;
	
	public UserDaoImpl() throws SQLException {
		connection = getConnection();
		pst1 = connection.prepareStatement("SELECT * FROM USERS WHERE email=? AND password=?");
		pst2 = connection.prepareStatement("SELECT * FROM USERS");
		pst3 = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?,?)");
	}
	
	@Override
	public User validateUser(String email, String password) throws SQLException {
		pst1.setString(1,email);
		pst1.setString(2,password);
		//id, first_name, last_name, email, password | city | role
		
		ResultSet rst = pst1.executeQuery();
		
		if(rst.next()) {
			return new User(rst.getInt(1),rst.getString(2),
					rst.getString(3),rst.getString(4),
					rst.getString(5),rst.getString(6),
					rst.getString(7));
		}
		
		return null;
	}

	@Override
	public List<User> getAllUsers() throws SQLException {

	    ResultSet rst = pst2.executeQuery();
	    List<User> users = new ArrayList<User>();
	    
	    while(rst.next()) {
	    	users.add(new User(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7)));
	    }
		return users;
	}

	@Override
	public String addUser(User user) throws SQLException {
		pst3.setInt(1, user.getId());
		pst3.setString(2,user.getFirstName());
		pst3.setString(3,user.getLastName());
		pst3.setString(4,user.getEmail());
		pst3.setString(5,user.getPassword());
		pst3.setString(6,user.getCity());
		pst3.setString(7,user.getRole());
		
		if(pst3.executeUpdate() == 1) {
			return "User Added Successfully";			
		}
		return "Fail to add User";
		
	}

	@Override
	public String updatePassword() throws SQLException {
		
		return null;
	}

	@Override
	public String removeUser(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cleanUp() throws SQLException {
		if(pst1 == null) {
			pst1.close();
		}
		if(pst2 == null) {
			pst2.close();
		}
		if(pst3 == null) {
			pst3.close();
		}
		if(pst4 == null) {
			pst4.close();
		}

	}

}
