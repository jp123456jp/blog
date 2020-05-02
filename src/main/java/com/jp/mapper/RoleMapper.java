package com.jp.mapper;

import com.jp.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: blog
 * @Package: com.jp.mapper
 * @ClassName: RoleMapper
 * @Description:
 * @Author: jp
 * @CreateDate: 2020/5/2 14:07
 * @UpdateUser:
 * @UpdateDate: 2020/5/2 14:07
 * @UpdateRemark:
 * @Version: 1.0
 */
@Mapper
@Repository
public interface RoleMapper {
    public List<Role> queryRolesByUserId(long userId);
}
