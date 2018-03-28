package demo.service.impl;

import demo.entity.User;
import demo.mapper.UserDao;
import demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by nan on 2018/3/28 14:57
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    public User getByUsername(String username){
        return userDao.getByUsername(username);
    }
}
