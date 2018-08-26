package jvb002.bookstore.app.service.usermanagement;

import java.util.List;

import jvb002.bookstore.app.dto.UserVO;
import jvb002.bookstore.app.model.usermanagement.User;

public interface UserService {

	public void insertUser(UserVO userVO);
	public List<User> getList();
	public void deleteUser(int id);
	public User getDetails(int id);
}
