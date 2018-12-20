package dao.impl;

import dao.BaseDao;
import dao.UserDao;
import entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao
{
    public UserDaoImpl()
    {
        super.setNs("UserMapper");
    }
}
