package com.lxjn.hgd.module.model.service.impl;

import com.lxjn.hgd.module.model.entity.User;
import com.lxjn.hgd.module.model.mapper.UserMapper;
import com.lxjn.hgd.module.model.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lxjn
 * @since 2020-11-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
