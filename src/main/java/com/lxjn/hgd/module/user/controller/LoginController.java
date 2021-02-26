package com.lxjn.hgd.module.user.controller;


import com.lxjn.hgd.module.user.entity.User;
import com.lxjn.hgd.module.user.service.IUserService;
import com.lxjn.hgd.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "用户登录模块")
@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    IUserService userService;



    @ApiOperation(value = "账户登录")
    @GetMapping("/account")
    public Result account(@ApiParam("自动登录") Boolean autoLogin, @ApiParam("用户id") String username, @ApiParam("密码") String password){
        try{
            return Result.SUCCESS();
        }catch (Exception e){
            return Result.ERROR();
        }
    }

    @ApiOperation(value = "验证码登录")
    @PostMapping("/mobile")
    public void mobile(
            @ApiParam("手机号") String mobile,
            @ApiParam("验证码") String captcha
    ){

    }

}
