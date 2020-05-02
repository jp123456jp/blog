package com.jp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: blog
 * @Package: com.jp.controller
 * @ClassName: HelloCotroller
 * @Description:
 * @Author: jp
 * @CreateDate: 2020/5/2 12:57
 * @UpdateUser:
 * @UpdateDate: 2020/5/2 12:57
 * @UpdateRemark:
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/admin/add")
    public String admin(){
        return "admin";
    }
    @GetMapping("/user/use")
    public String user(){
        return "user";
    }

}
