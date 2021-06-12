package com.app.RealEstateApp.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.RealEstateApp.entity.User;
import com.app.RealEstateApp.repository.UserRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	UserRepository userRepository;

	@Transactional
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
      return userRepository.save(user);
	}

}
