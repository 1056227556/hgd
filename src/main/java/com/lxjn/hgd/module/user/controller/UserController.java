package com.lxjn.hgd.module.user.controller;


import com.lxjn.hgd.module.user.entity.User;
import com.lxjn.hgd.module.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lxjn
 * @since 2020-12-24
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/getUser")
    public User getUser(Integer id){
        return userService.getById(id);
    }


}
