package jvb002.bookstore.app.service.usermanagement;

import jvb002.bookstore.app.dto.UserVO;
import jvb002.bookstore.app.model.usermanagement.User;

public interface UserService {

	public void insertUser(UserVO userVO);
	
	public User getUser(int id);

	public void updateUser(UserVO userVO);
	
}
