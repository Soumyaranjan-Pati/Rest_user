package com.symentix.user.service;

import java.util.List;
import java.util.Optional;

import com.symentix.user.dto.User;

public interface IUserService {
	List<User> getAllUser();

	Optional<User> getUserById(int uId);

	void addUser(User u);

	void updateUser(User u, int uId);

	void deleteUser(int uId);
}
