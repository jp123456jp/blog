package com.jp.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @ProjectName: blog
 * @Package: com.jp.pojo
 * @ClassName: Role
 * @Description:
 * @Author: jp
 * @CreateDate: 2020/5/2 13:23
 * @UpdateUser:
 * @UpdateDate: 2020/5/2 13:23
 * @UpdateRemark:
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role  {
    private Long id;
    private String name;
}
