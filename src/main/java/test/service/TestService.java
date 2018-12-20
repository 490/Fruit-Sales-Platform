package test.service;

import java.util.List;

import test.entity.User;

public interface TestService
{
	public List<User> findUserByName(User user); 
}
