package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  实现类的包名必须与接口的包名一致 AnnotationBean.postProcessAfterInitialization
 * </p>
 * Service必须的dubbo下的包
 * @author: Eric
 * @since: 2020/11/19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(int id) {
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userDao.findById(id);
    }
}
