/**
 * 
 */
package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.UserDo;
import com.example.repository.UserRepository;

/**
 * @author Harry.Lee
 *
 */
@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	public void join(UserDo user) {
		repository.save(user);
	}
}