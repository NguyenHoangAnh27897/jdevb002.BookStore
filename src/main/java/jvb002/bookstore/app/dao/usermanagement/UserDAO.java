package jvb002.bookstore.app.dao.usermanagement;

import jvb002.bookstore.app.model.usermanagement.User;

public interface UserDAO {

	public void insertUser(User user);
	public void getUser(int id);
}
