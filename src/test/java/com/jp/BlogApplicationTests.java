package com.jp;

import com.jp.mapper.RoleMapper;
import com.jp.mapper.UserMapper;
import com.jp.pojo.Role;
import com.jp.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Test
    void contextLoads() {
        User user = userMapper.queryUserByUsername("renwoxing");
        System.out.println(user);
        List<Role> roles = roleMapper.queryRolesByUserId(6);
        System.out.println(roles);
    }

}
