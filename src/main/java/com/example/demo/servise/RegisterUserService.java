package com.example.demo.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class RegisterUserService {

	@Autowired
	private UserRepository userRepository;
	
	
	/**
	 * ユーザー登録
	 * @param user
	 */
	public void insert(User user) {
		userRepository.insert(user);
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}
}
