package dao;

import dao.impl.StudentDaoImpl;
import dao.impl.UserDAOImpl;

public class DAOFactory {

	public static UserDAO getUserDAO() {
		return new UserDAOImpl();
	}
	
	public static StudentDao getStidentDao(){
		return new StudentDaoImpl();
	}
	
}
