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
@TableName("tb_model_field")
public class ModelField extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 字段
     */
    @TableField("field")
    private String field;

    /**
     * 名称
     */
    @TableField("field_name")
    private String fieldName;

    /**
     * 所属字段类型
     */
    @TableField("field_type_id")
    private Integer fieldTypeId;

    /**
     * 所属建模表
     */
    @TableField("model_table_id")
    private Integer modelTableId;

    /**
     * 删除策略 0：CASCADE 1：NO ACTION 2：RESTRICT 3：SET NULL
     */
    @TableField("delete_way")
    private Integer deleteWay;

    /**
     * 主键字段id
     */
    @TableField("model_field_id")
    private Integer modelFieldId;

    /**
     * 字段长度
     */
    @TableField("length")
    private Integer length;

    /**
     * 小数点精度
     */
    @TableField("accuracy")
    private Integer accuracy;


}
