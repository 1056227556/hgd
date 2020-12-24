package com.lxjn.hgd.module;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EntityParent {

    /**
     * 主键自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 创建人
     */
    @TableField("creator")
    private Integer creator;

    /**
     * 创建时间
     */
    @TableField("createtime")
    private LocalDateTime createTime;

    /**
     * 最后修改人
     */
    @TableField("updater")
    private Integer updater;

    /**
     * 最后修改时间
     */
    @TableField("updatetime")
    private LocalDateTime updatetime;

    /**
     * 排序
     */
    @TableField("rank")
    private Double rank;
}
