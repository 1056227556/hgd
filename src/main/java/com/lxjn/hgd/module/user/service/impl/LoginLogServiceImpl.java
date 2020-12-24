package com.lxjn.hgd.module.user.service.impl;

import com.lxjn.hgd.module.user.entity.LoginLog;
import com.lxjn.hgd.module.user.mapper.LoginLogMapper;
import com.lxjn.hgd.module.user.service.ILoginLogService;
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
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

}
