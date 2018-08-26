package jvb002.bookstore.app.service.usermanagement;

import java.util.List;

import jvb002.bookstore.app.dto.UserVO;
import jvb002.bookstore.app.model.usermanagement.User;

public interface UserService {

	public void insertUser(UserVO userVO);
<<<<<<< HEAD
	
	public User getUserById(int id);
=======
	public List<User> getList();
	public void deleteUser(int id);
	public User getDetails(int id);
>>>>>>> 00588be23cfc467c672bb5888601fb5ecfc22f6d
}
