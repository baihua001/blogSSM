package cn.tf.blogSSM.service.serviceImpl;

import cn.tf.blogSSM.bean.User;
import cn.tf.blogSSM.dao.UserDao;
import cn.tf.blogSSM.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String regist(User user) {
        return null;
    }

    @Override
    public User login(User user) {
        return userDao.findByUsernameAndPassword(user);
    }

    @Override
    public String updateUser(User user) {
        return null;
    }
}
