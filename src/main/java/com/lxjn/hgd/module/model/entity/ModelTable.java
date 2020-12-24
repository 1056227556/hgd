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
@TableName("tb_model_table")
public class ModelTable extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 表名称
     */
    @TableField("table_text")
    private String tableText;

    /**
     * 数据库表名
     */
    @TableField("table_name")
    private String tableName;

    /**
     * 是否是视图或虚拟表
     */
    @TableField("virtual")
    private Boolean virtual;

    /**
     * 所属模块
     */
    @TableField("model_module_id")
    private Integer modelModuleId;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;


}
