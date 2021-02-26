package com.lxjn.hgd.module.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("tb_id_card")
public class IdCard extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 性别
     */
    @TableField("sex")
    private Boolean sex;

    /**
     * 民族
     */
    @TableField("nation")
    private String nation;

    /**
     * 出生
     */
    @TableField("birth")
    private String birth;

    /**
     * 住址
     */
    @TableField("address")
    private String address;

    /**
     * 身份证号
     */
    @TableField("id_no")
    private String idNo;

    /**
     * 签发机关
     */
    @TableField("issuing")
    private String issuing;

    /**
     * 签发日期
     */
    @TableField("issue_date")
    private LocalDate issueDate;

    /**
     * 失效日期
     */
    @TableField("expiry_date")
    private LocalDate expiryDate;


}
