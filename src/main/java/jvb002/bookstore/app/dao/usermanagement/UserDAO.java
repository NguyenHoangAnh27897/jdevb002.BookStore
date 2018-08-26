package jvb002.bookstore.app.dao.usermanagement;

import java.util.List;

import jvb002.bookstore.app.dto.UserVO;
import jvb002.bookstore.app.model.usermanagement.User;

public interface UserDAO {

	public void insertUser(User user);

	public User getUserById(int id);

	public List<User> userList();

	public void deleteUser(int id);
}
