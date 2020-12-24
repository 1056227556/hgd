package com.lxjn.hgd.module.user.service.impl;

import com.lxjn.hgd.module.user.entity.User;
import com.lxjn.hgd.module.user.mapper.UserMapper;
import com.lxjn.hgd.module.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lxjn
 * @since 2020-12-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
