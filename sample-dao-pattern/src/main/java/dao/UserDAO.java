package dao;

import model.User;

public interface UserDAO {

	public void insert(User user);

	public void update(User user);

	public void delete(int userId);

	public User[] findAll();

	public User findByKey(int userId);
}
