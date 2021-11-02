package com.brijcode.springboot.service;

import com.brijcode.springboot.model.User;
import com.brijcode.springboot.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto userRegistrationDto);
}
