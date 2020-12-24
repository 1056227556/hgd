package com.lxjn.hgd.module.language.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lxjn.hgd.module.EntityParent;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 多国语言消息表
 * </p>
 *
 * @author lxjn
 * @since 2020-12-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("tb_language_msg")
public class LanguageMsg extends EntityParent {

    private static final long serialVersionUID = 1L;

    /**
     * 语种
     */
    @TableField("language_id")
    private Integer languageId;

    /**
     * 编码
     */
    @TableField("code")
    private Integer code;

    /**
     * 默认消息内容
     */
    @TableField("auto_text")
    private String autoText;

    /**
     * 消息内容
     */
    @TableField("text")
    private String text;


}
