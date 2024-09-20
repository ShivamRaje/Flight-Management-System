package service;

import model.User;

public interface UserInterface {
	public User addUser(User user);
	public User getUserById(long id);
	public User getLogin(String userName, String password);
	public void logout();
	public int updateUser(User newUser, long userId);
	public int deleteUser(long userId);

}
