package jvb002.bookstore.app.service.usermanagement;

import java.util.List;

import jvb002.bookstore.app.dao.usermanagement.UserDAO;
import jvb002.bookstore.app.dto.UserVO;
import jvb002.bookstore.app.model.usermanagement.User;
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

<<<<<<< HEAD
	public User getUserById(int id) {
		User user = new User();
		user = this.userDAO.getUserById(id);
=======
	@Override
	public List<User> getList() {
		return userDAO.userList();
	}

	@Override
	public void deleteUser(int id) {
		userDAO.deleteUser(id);
		
	}

	@Override
	public User getDetails(int id) {
		
		return null;
	}
>>>>>>> 00588be23cfc467c672bb5888601fb5ecfc22f6d

		return user;
	}
}
