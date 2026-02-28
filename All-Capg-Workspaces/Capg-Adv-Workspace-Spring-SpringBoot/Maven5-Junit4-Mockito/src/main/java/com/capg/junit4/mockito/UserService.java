package com.capg.junit4.mockito;

public class UserService {
	private UserDAO userDao;

	public UserService(UserDAO userDao) {
		this.userDao = userDao;
	}
	public String getUserName(int id) {
		return userDao.findUserNameById(id);
	}
}
