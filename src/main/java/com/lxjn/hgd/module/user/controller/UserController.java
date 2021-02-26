package com.lxjn.hgd.module.user.controller;


import com.lxjn.hgd.module.user.entity.User;
import com.lxjn.hgd.module.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户管理模块")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @ApiOperation(value = "获取用户信息", notes = "使用id获取")
    @GetMapping("/getUser")
    public User getUser(@ApiParam("用户id") Integer id){
        return userService.getById(id);
    }

}
