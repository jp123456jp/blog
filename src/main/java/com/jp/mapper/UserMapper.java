package com.jp.mapper;

import com.jp.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: blog
 * @Package: com.jp.mapper
 * @ClassName: UserMapper
 * @Description:
 * @Author: jp
 * @CreateDate: 2020/5/2 13:41
 * @UpdateUser:
 * @UpdateDate: 2020/5/2 13:41
 * @UpdateRemark:
 * @Version: 1.0
 */
@Mapper
@Repository
public interface UserMapper {
    public User queryUserByUsername(String username);
}
