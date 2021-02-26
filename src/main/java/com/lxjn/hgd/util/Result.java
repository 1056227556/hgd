package com.lxjn.hgd.util;

import com.lxjn.hgd.enums.ResultCode;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

// 统一返回消息
public class Result {
    private Boolean success; // 请求状态
    private Object data; // 返回的值
    private String errorCode; // 错误码
    private String errorMessage; // 错误信息
    private Integer showType; // 提示显示类型： 0 silent; 1 message.warn; 2 message.error; 4 notification; 9 page
    private String traceId; // 唯一请求id
    private String host; // 报错服务器的地址

    public Result setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public Result setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Result setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public Result setShowType(Integer showType) {
        this.showType = showType;
        return this;
    }

    private Result(){
        this.traceId = UUID.randomUUID().toString().replace("-","").toUpperCase();
    }
    private Result(ResultCode resultCode){
        this.success = false;
        this.errorCode = resultCode.getErrorCode();
        this.errorMessage = resultCode.getErrorMessage();
        this.showType = 0;
        this.traceId = UUID.randomUUID().toString().replace("-","").toUpperCase();
        this.host = getHost();
    }
    private String getHost(){
        String host = "";
        try {
            host = InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return host;
    }

    /**
     * 请求成功
     * @return
     */
    public static Result SUCCESS(){
        return new Result().setSuccess(true);
    }

    /**
     * 请求成功并返回数据
     * @param data
     * @return
     */
    public static Result SUCCESS(Object data){
        return new Result().setSuccess(true).setData(data);
    }

    /**
     * 服务器异常
     * @return
     */
    public static Result ERROR(){
        return new Result(ResultCode.ERROR);
    }

    /**
     * 服务器异常
     * @param errorMessage 错误信息
     * @return
     */
    public static Result ERROR(String errorMessage){
        return new Result(ResultCode.ERROR).setErrorMessage(errorMessage);
    }
}
