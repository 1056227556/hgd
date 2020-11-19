package com.lxjn.hgd.module.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lxjn.hgd.module.EntityParent;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 建模表记录表
 * </p>
 *
 * @author lxjn
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_model_table")
public class ModelTable extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 表名称
     */
    @TableField("tabletext")
    private String tabletext;

    /**
     * 数据库表名
     */
    @TableField("tablename")
    private String tablename;

    /**
     * 是否是虚拟表
     */
    @TableField("isvirtual")
    private Boolean isvirtual;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;


}
