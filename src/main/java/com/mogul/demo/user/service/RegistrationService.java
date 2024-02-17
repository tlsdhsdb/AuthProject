package com.mogul.demo.user.service;

import com.mogul.demo.user.dto.UserRegistrationRequest;
import com.mogul.demo.user.dto.UserRegistrationResponse;

public interface RegistrationService {
	UserRegistrationResponse register(UserRegistrationRequest userRegistrationRequest);
}
