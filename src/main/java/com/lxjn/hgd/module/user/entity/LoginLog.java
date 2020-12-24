package com.lxjn.hgd.module.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lxjn.hgd.module.EntityParent;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lxjn
 * @since 2020-12-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_login_log")
public class LoginLog extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 账户
     */
    @TableField("user_name")
    private String userName;

    /**
     * 登录平台 0：电脑 1：手机 2：平板
     */
    @TableField("login_type")
    private Integer loginType;

    /**
     * ip地址
     */
    @TableField("ip")
    private String ip;

    /**
     * 地址
     */
    @TableField("address")
    private String address;

    /**
     * 状态 0：失败 1 ：成功
     */
    @TableField("status")
    private Boolean status;


}
