package com.lxjn.hgd.module.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lxjn.hgd.module.EntityParent;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 建模模块表
 * </p>
 *
 * @author lxjn
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_model_module")
public class ModelModule extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 模块名称
     */
    @TableField("modename")
    private String modename;

    /**
     * 所属应用
     */
    @TableField("applicationid")
    private Integer applicationid;

    /**
     * 状态	0：正常	-1：删除	
     */
    @TableField("status")
    private Integer status;


}
