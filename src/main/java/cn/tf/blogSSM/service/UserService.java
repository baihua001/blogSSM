package cn.tf.blogSSM.service;

import cn.tf.blogSSM.bean.User;

public interface UserService {
    /**
     * 注册
     * @param user
     * @return
     */
    String regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    String updateUser(User user);
}
