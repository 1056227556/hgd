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
@TableName("tb_model_module")
public class ModelModule extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 模块名称
     */
    @TableField("mode_name")
    private String modeName;

    /**
     * 模块包名
     */
    @TableField("package_name")
    private String packageName;

    /**
     * 所属应用
     */
    @TableField("application_id")
    private Integer applicationId;

    /**
     * 状态 0：正常 -1：删除
     */
    @TableField("status")
    private Integer status;


}
