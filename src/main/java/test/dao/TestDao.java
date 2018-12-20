package test.dao;

import java.util.List;

import test.entity.User;

public interface TestDao {
	public List<User> findUserByName(User user);   
}
