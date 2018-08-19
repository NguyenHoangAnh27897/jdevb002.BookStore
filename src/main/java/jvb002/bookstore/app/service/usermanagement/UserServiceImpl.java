package jvb002.bookstore.app.service.usermanagement;


import jvb002.bookstore.app.dao.usermanagement.UserDAO;
import jvb002.bookstore.app.model.usermanagement.User;
import jvb002.bookstore.app.util.ConvertUtils;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public void insertUser(User user) {
		this.userDAO.insertUser(user);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
