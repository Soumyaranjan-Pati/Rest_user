package com.symentix.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symentix.user.dto.User;
import com.symentix.user.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserRepository repository;
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<User> getUserById(int uId) {
		// TODO Auto-generated method stub
		return repository.findById(uId);
	}

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		repository.save(u);
	}

	@Override
	public void updateUser(User u, int uId) {
		// TODO Auto-generated method stub
		repository.save(u);
	}

	@Override
	public void deleteUser(int uId) {
		// TODO Auto-generated method stub
		repository.deleteById(uId);
	}

}
