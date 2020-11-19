package com.lxjn.hgd.module.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lxjn.hgd.module.EntityParent;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 建模字段表
 * </p>
 *
 * @author lxjn
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_model_field_type")
public class ModelFieldType extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 分类	0：单行文本框	1：多行文本框	2：文件上传	
     */
    @TableField("typeclass")
    private String typeclass;

    /**
     * 类型名称
     */
    @TableField("typename")
    private String typename;

    /**
     * java中的类型
     */
    @TableField("type_by_java")
    private String typeByJava;

    /**
     * 数据库中的类型
     */
    @TableField("type_by_database")
    private String typeByDatabase;

    /**
     * 所属数据库类型	0:mySql	1:SQL Server	2:Oracle
     */
    @TableField("database_type")
    private Integer databaseType;


}
