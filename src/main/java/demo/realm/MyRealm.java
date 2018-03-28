package demo.realm;

import demo.entity.User;
import demo.service.impl.UserServiceImpl;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.concurrent.Executor;

/**
 * Created by nan on 2018/3/28 14:52
 */
public class MyRealm extends AuthorizingRealm {
    @Resource
    private UserServiceImpl userServiceImpl;

    //为当前登录成功的用户授予权限和角色，已经登录成功了。
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }


    //验证当前登录的用户，获取认证信息。
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username=(String) token.getPrincipal();//获取用户名


          User user=userServiceImpl.getByUsername(username);
          if(user==null){
            throw new UnknownAccountException();
        }

        return new SimpleAuthenticationInfo(username,user.getPassword(),getName());
    }
}
