package dao.impl;

import dao.UserDAO;
import model.User;

public class UserDAOImpl implements UserDAO {

	public void insert(User user) {
		System.out.println("insert user");
	}

	public void update(User user) {
		System.out.println("update user");
		
	}

	public void delete(int userId) {
		System.out.println("delete user");
		
	}

	public User[] findAll() {
		System.out.println("findAll users");
		return null;
	}

	public User findByKey(int userId) {
		System.out.println("findByKey User");
		return null;
	}

}
