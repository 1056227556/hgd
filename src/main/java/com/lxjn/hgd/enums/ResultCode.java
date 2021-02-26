package com.lxjn.hgd.enums;

import lombok.Getter;

@Getter
public enum ResultCode {
    ERROR("500","服务器异常！");
    private String errorCode;
    private String errorMessage;

    ResultCode(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
