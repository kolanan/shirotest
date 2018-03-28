package demo.mapper;

import demo.entity.User;

import java.util.Set;

/**
 * Created by nan on 2018/3/28 14:54
 */
public interface UserDao {
    User getByUsername(String username);


}
