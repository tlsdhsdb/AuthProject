package com.mogul.demo.user.service;

import com.mogul.demo.user.entity.User;

public interface UserService {
	User addUser(User user);
	User modifyUser(User user);
	User getUser(Long id);
	User getUserByUsername(String username);
	User getUserByToken();
	Boolean deleteUser(Long id);
	void duplicateNickname(String nickname);
	void duplicateUsername(String username);
	void passwordEqual(String password_input,String password);
}
