package com.jp.service;

import com.jp.mapper.RoleMapper;
import com.jp.mapper.UserMapper;
import com.jp.pojo.Role;
import com.jp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: blog
 * @Package: com.jp.service
 * @ClassName: UserService
 * @Description:
 * @Author: jp
 * @CreateDate: 2020/5/2 14:15
 * @UpdateUser:
 * @UpdateDate: 2020/5/2 14:15
 * @UpdateRemark:
 * @Version: 1.0
 */
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.queryUserByUsername(s);
        if (user==null){
            return new User();
        }
        List<Role> roles = roleMapper.queryRolesByUserId(user.getId());
        user.setRoles(roles);
        return user;
    }
}
