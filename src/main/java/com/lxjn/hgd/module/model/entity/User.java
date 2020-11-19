package com.lxjn.hgd.module.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lxjn.hgd.module.EntityParent;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author lxjn
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_user")
public class User extends EntityParent {

    private static final long serialVersionUID = 1L;


}
