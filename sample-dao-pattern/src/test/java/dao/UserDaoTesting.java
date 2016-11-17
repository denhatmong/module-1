package dao;

import model.User;

public class UserDaoTesting {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Jinoy P George");
		user.setAge(35);
		
		// get a reference to UserDAO object
		UserDAO userDAO = DAOFactory.getUserDAO();
		// call insert method by passing user object
		userDAO.insert(user);

	}

}
