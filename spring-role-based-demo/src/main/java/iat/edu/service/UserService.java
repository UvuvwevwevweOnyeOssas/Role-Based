package iat.edu.service;

import java.util.List;

import iat.edu.model.User;

public interface UserService {
	User authenrticate(String userName, String password);
	List<User> findAllUsers();
	User createUser(User user);
}