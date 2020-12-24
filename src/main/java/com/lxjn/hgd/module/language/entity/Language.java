package com.lxjn.hgd.module.language.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lxjn.hgd.module.EntityParent;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 语种编码表
 * </p>
 *
 * @author lxjn
 * @since 2020-12-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_language")
public class Language extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 语言
     */
    @TableField("language")
    private String language;

    /**
     * 平台语种编码
     */
    @TableField("web_code")
    private String webCode;

    /**
     * 百度语种编码
     */
    @TableField("baidu_code")
    private String baiduCode;

    /**
     * 有道语种编码
     */
    @TableField("youdao_code")
    private String youdaoCode;


}
