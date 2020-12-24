package com.lxjn.hgd.module.model.entity;

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
@TableName("tb_model_application")
public class ModelApplication extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 应用名称
     */
    @TableField("app_name")
    private String appName;

    /**
     * 备注说明
     */
    @TableField("remark")
    private String remark;


}
