package com.lxjn.hgd.module.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lxjn.hgd.module.EntityParent;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel("用户信息")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_user")
public class User extends EntityParent {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("名称")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty("密码")
    @TableField("password")
    private String password;


}
