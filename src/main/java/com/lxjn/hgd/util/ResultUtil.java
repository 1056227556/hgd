package com.lxjn.hgd.util;

import com.lxjn.hgd.module.language.entity.LanguageMsg;

/**
 * 统一消息工具类
 */
public class ResultUtil {
    private Integer code;
    private String msg;
    private Object data;

    public ResultUtil (LanguageMsg msg, Object data){

    }

    public ResultUtil (LanguageMsg msg){

    }
    /**
     * 请求成功
     * @return 状态对象
     */
    public static ResultUtil SUCCESS(){
        return new ResultUtil(null);
    }
}
