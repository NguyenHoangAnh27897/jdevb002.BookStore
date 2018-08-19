package jvb002.bookstore.app.service.usermanagement;


import jvb002.bookstore.app.dao.usermanagement.UserDAO;
import jvb002.bookstore.app.dto.UserVO;
import jvb002.bookstore.app.util.ConvertUtils;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public void insertUser(UserVO userVO) {
		this.userDAO.insertUser(ConvertUtils.convertUserVOToUser(userVO));
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	

}
